package com.wonderrobot.sfhanbaizaikokanrishisutemu.service;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.wonderfulfly.core.util.fileimport.Excel;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.SpringPropertiesUtil;
import com.wonderfulfly.common.SpringRequestUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: ExportDownloadService
 * @version

 */

@Service
public class ExportDownloadService {

   
	@Log
	public void exportFileDownload (HttpServletRequest request, HttpServletResponse response) throws Exception {

		String ErrString = null;
		boolean isError = false;
		String fileID = null;
		String realPath = null;
		String encode = null;
		fileID = StringUtil.changeNullToBlank(SpringRequestUtil.getParameterByUTF8(request, "e"));
		encode = StringUtil.changeNullToBlank(SpringRequestUtil.getParameterByUTF8(request, "d"));

		if (!StringUtil.isNullOrBlank(fileID)) {
			realPath = SpringPropertiesUtil.getPrint_file_path();
			if (fileID.lastIndexOf("xls") == fileID.length() - 3 || fileID.lastIndexOf("xlsx") == fileID.length() - 4) {
				excelFileWrite(realPath, fileID, response);
			} else {
				fixFileWrite(realPath, fileID, encode, response);
			}
		} else {
			isError = true;
			ErrString = "該当データが存在していません。";
		}

	}

   
	@Log
	public void excelFileWrite (String realPath, String fileID, HttpServletResponse response) throws Exception {

		OutputStream outs = null;
		FileInputStream fin = null;
		Excel excel = null;
		Workbook wb = null;
		realPath = realPath + "/" + fileID;
		fin = new FileInputStream(realPath);
		response.setContentType("application/msexcel");
		response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileID, "UTF-8"));
		outs = response.getOutputStream();
		excel = new Excel();
		if ("XLSX".equals(excel.getExcelVersion(realPath))) {
			wb = new XSSFWorkbook(fin);
		} else if ("XLS".equals(excel.getExcelVersion(realPath))) {
			wb = new HSSFWorkbook(new POIFSFileSystem(fin));
		}
		if (wb != null) {
			wb.write(outs);
			outs.flush();
			
			outs.close();
			outs = null;
			wb.close();
			wb = null;
			fin.close();
			fin = null;
		}

	}

   
	@Log
	public void fixFileWrite (String realPath, String fileID, String encode, HttpServletResponse response) throws Exception {

		OutputStream outs = null;
		FileInputStream fin = null;
		realPath = realPath  + "/" +  fileID;
		fin = new FileInputStream(realPath);
		response.setContentType("application/octet-stream;charset=" + encode);
		response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileID, "UTF-8"));
		outs = response.getOutputStream();
		byte[] outputByte = new byte[4096];
		int len = 4096;
		while ((len = fin.read(outputByte, 0, 4096)) != -1) {
			outs.write(outputByte, 0, len);
		}
		outs.flush();
		
		outs.close();
		outs = null;
		fin.close();
		fin = null;

	}
}