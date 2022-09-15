package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A006;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006.A006G4PrintService;
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
 *      class: A006G4PrintController
 *      Page: 商品
 * @version

 */

@Controller
public class A006G4PrintController {
	@Autowired
	private A006G4PrintService A006G4PrintService;
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
	@RequestMapping("A006G4Print.do")
	public void A006G4Print (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("商品", request);
			
			A006G4PrintService.A006G4Print(request, jsonObj);
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
	@RequestMapping("A006G4PrintFile.do")
	public void A006G4PrintFile (HttpServletRequest request, HttpServletResponse response) throws Exception {

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