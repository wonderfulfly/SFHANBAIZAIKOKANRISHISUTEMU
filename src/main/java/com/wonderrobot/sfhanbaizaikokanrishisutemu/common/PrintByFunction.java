package com.wonderrobot.sfhanbaizaikokanrishisutemu.common;
import java.io.File;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.saasforce.business.edit.inout.data.ExcelDataBean;
import com.wonderfulfly.saasforce.business.edit.action.controller.PrintExcel;
public class PrintByFunction {
	private ExcelDataBean excelDataBean;
	public void setExcelDataBean(ExcelDataBean edb) {
		excelDataBean = edb;
	}
	public String print (String templateFileName, String templateFileID, JSONWFCObject jsonObj) throws Exception {
		return print(templateFileName, templateFileID, null, jsonObj);
	}
	
	public String print (String templateFileName, String templateFileID, String password, JSONWFCObject jsonObj) throws Exception {
		String outFileID = null;
		String fileNm = null;
		String templateFilePath = null;
		String outFilePath = null;
		String outFileFullPath = null;
		File file = null;
		PrintExcel printExcel = null;
		String templateFileFullPath = null;
		
		fileNm = getFileName(templateFileName, excelDataBean.getFileName());
        if (!StringUtil.isNullOrBlank(excelDataBean.getErrorMsg())) {
            jsonObj.setMessageValue("e", excelDataBean.getErrorMsg() + " [" + fileNm + "]");
            return null;
        }
        
        templateFilePath = SpringPropertiesUtil.getPrint_template_file_path();
        
        templateFileFullPath = System.getProperty("user.dir") + templateFilePath + "/" + templateFileID;
        
        file = new File(templateFileFullPath);
        if (file.exists()) {
        	outFilePath = SpringPropertiesUtil.getPrint_file_path();
        	OutPutDataConstant OutPutDataConstant = new OutPutDataConstant();
        	OutPutDataConstant.createDirs(outFilePath);
			
        	outFileID = getOutFileID(templateFileID, fileNm);
        } else {
        	jsonObj.setMessageValue("e", "テンプレートファイルが存在していません。");
            return null;
        }
        
        outFileFullPath = outFilePath + "/" + outFileID;
        
        printExcel = new PrintExcel();
        printExcel.setExcelDataBean(excelDataBean);
        printExcel.setTemplateFileFullPath(templateFileFullPath);
		printExcel.createOutFile(outFileFullPath, password, jsonObj);
		return outFileID;
	}
	private String getFileName(String templateFileName, String fileName) {
		int posExt = templateFileName.lastIndexOf(".");
		if (StringUtil.isNullOrBlank(fileName)) {
			if (posExt > -1) {
				return templateFileName.substring(0, posExt); 
			} else {
				return templateFileName;
			}
		} else {
			return fileName;
		}
	}
	private String getOutFileID(String templateFileID, String fileName) {
		StringBuffer sBuffer = new StringBuffer();
		String extension = "";
		String timeStamp = DateUtil.getFilePatternDateTimeMillisecond();
		int posExt = templateFileID.lastIndexOf(".");
		if (posExt > -1) {
			extension = templateFileID.substring(posExt); 
		}
		sBuffer.append(fileName).append("_").append(timeStamp).append(extension);
		return sBuffer.toString();
	}
}
