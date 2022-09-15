package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A008;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008.A008Q2PrintService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LogFourJUtil;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.PrintDownloadService;

/**
 * @project
 *     
 * @comment
 *      class: A008Q2PrintController
 *      Page: 入金管理検索
 * @version

 */

@Controller
public class A008Q2PrintController {
	@Autowired
	private A008Q2PrintService A008Q2PrintService;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private PrintDownloadService PrintDownloadService;

   /**
	* 印刷処理 method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A008Q2Print.do")
	public void A008Q2Print (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("入金管理検索", request);
			
			A008Q2PrintService.A008Q2Print(request, jsonObj);
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
	@RequestMapping("A008Q2PrintFile.do")
	public void A008Q2PrintFile (HttpServletRequest request, HttpServletResponse response) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			PrintDownloadService.printFileDownload(request, response);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}
}