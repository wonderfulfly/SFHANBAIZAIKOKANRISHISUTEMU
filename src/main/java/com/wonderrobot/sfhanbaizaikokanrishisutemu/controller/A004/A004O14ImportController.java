package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A004;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004.A004O14ImportService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LoginCheckUtil;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;

/**
 * @project
 *     
 * @comment
 *      class: A004O14ImportController
 * @version

 */

@Controller
public class A004O14ImportController {
	@Autowired
	private A004O14ImportService A004O14ImportService;
	@Autowired
	private MessageUtil messageUtil;

   /**
	* インスポート処理 method
	* 
	* @param request
	* @param response
	* @param files
	* @throws Exception
	*/
	@RequestMapping(value = "A004O14Import.do", produces = "text/html;charset=UTF-8")
	public void A004O14Import (HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "O14importFile", required = true) MultipartFile[] files) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			
			
			A004O14ImportService.A004O14Import(files, request, jsonObj);
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
}