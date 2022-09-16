package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A005;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A005.A005C4ExportService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LogFourJUtil;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.ExportDownloadService;

/**
 * @project
 *     
 * @comment
 *      class: A005C4ExportController
 *      Page: データインタフェース
 * @version

 */

@Controller
public class A005C4ExportController {
	@Autowired
	private A005C4ExportService A005C4ExportService;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private ExportDownloadService ExportDownloadService;

   /**
	* エクスポート処理 method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A005C4Export.do")
	public void A005C4Export (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("データインタフェース", request);
			
			A005C4ExportService.A005C4Export(request, jsonObj);
			jsonObjStr = jsonObj.toJSONString();
			if (!StringUtil.isNullOrBlank(jsonObjStr)) {
				out.print(jsonObjStr);
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}

   /**
	* ファイルダウンロード method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A005C4ExportFile.do")
	public void A005C4ExportFile (HttpServletRequest request, HttpServletResponse response) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			ExportDownloadService.exportFileDownload(request, response);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}
}