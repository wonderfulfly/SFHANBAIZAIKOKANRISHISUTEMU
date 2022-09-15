package com.wonderrobot.sfhanbaizaikokanrishisutemu.service;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.constant.FileConstant;
import java.io.File;
import java.io.BufferedInputStream;
import com.wonderfulfly.core.util.fileimport.Excel;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.SpringPropertiesUtil;
import com.wonderfulfly.common.SpringRequestUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: PrintDownloadService
 * @version

 */

@Service
public class PrintDownloadService {

   
	@Log
	public void printFileDownload (HttpServletRequest request, HttpServletResponse response) throws Exception {


		Excel excel = null;

		String ErrString = "";
		String fileID = "";
		String realPath = "";
		String fileFullPath = "";
		boolean isError = false;

		fileID = StringUtil.changeNullToBlank(request.getParameter("f")).trim();

		if (!StringUtil.isNullOrBlank(fileID)) {
			realPath = SpringPropertiesUtil.getPrint_file_path();
			fileFullPath = realPath + "/" + fileID;
			excel = new Excel();
			String version = excel.getExcelVersion(fileFullPath);
			if ((version.equals("XLSX")) || (version.equals("XLSM")) || version.equals("XLS")) {
				excelFileWrite(realPath, fileID, response);
			}
		} else {
			isError = true;
			ErrString = "該当データが存在していません。";
		}

	}

   
	@Log
	public void excelFileWrite (String realPath, String fileID, HttpServletResponse response) throws Exception {

		FileInputStream hFile = null;
		BufferedInputStream bis = null;
		OutputStream outs = null;
		realPath = realPath + "/" + fileID;
		
		hFile = new FileInputStream(realPath);
		bis = new BufferedInputStream(hFile);
		
		response.setContentType("application/octet-stream");
		fileID = URLEncoder.encode(fileID, "utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + fileID);

		outs = response.getOutputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		while ((len = bis.read(buffer)) >= 0) {
			outs.write(buffer, 0, len);
		}
		

	}
}