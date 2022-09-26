package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A004;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004.A004saveService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004.A004saveCheckService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004DataCheckEntity;

/**
 * @project
 *     
 * @comment
 *      class: A004saveController
 *      Page: 会社
 * @version

 */

@Controller
public class A004saveController {
	@Autowired
	private A004saveService A004saveService;
	@Autowired
	private A004saveCheckService A004saveCheckService;
	@Autowired
	private MessageUtil messageUtil;

   /**
	* 登録処理方法 method
	* 
	* @param A004DataCheckEntity
	* @param result
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A004F20091208153604208.do")
	public void A004F20091208153604208 (@Valid A004DataCheckEntity A004DataCheckEntity, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {

		String errMsg = null;
		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			
			if (result.hasFieldErrors()) {
				String messageError = messageUtil.message(result.getFieldError().getDefaultMessage());
				jsonObj.setMessageValue(JsonConstant.JSONID_ERR, messageError);
			} else {
				errMsg = A004saveCheckService.saveDataCheck(request,A004DataCheckEntity);
				if (StringUtil.isNullOrBlank(errMsg)) {
					A004saveService.A004F20091208153604208(request,A004DataCheckEntity, jsonObj);
				} else {
					jsonObj.setMessageValue("i", errMsg);
				}
			}
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