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
			fixFileWrite(realPath, fileID, encode, response);
		} else {
			isError = true;
			ErrString = "該当データが存在していません。";
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