package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A013;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013T7ImportService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LoginCheckUtil;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;

/**
 * @project
 *     
 * @comment
 *      class: A013T7ImportController
 * @version

 */

@Controller
public class A013T7ImportController {
	@Autowired
	private A013T7ImportService A013T7ImportService;
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
	@RequestMapping(value = "A013T7Import.do", produces = "text/html;charset=UTF-8")
	public void A013T7Import (HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "T7importFile", required = true) MultipartFile[] files) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			
			
			A013T7ImportService.A013T7Import(files, request, jsonObj);
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