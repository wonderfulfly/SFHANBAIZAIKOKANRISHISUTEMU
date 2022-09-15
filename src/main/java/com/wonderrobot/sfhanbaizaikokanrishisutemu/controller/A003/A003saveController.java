package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A003;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003.A003saveService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003.A003saveCheckService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003DataCheckEntity;

/**
 * @project
 *     
 * @comment
 *      class: A003saveController
 *      Page: 部門
 * @version

 */

@Controller
public class A003saveController {
	@Autowired
	private A003saveService A003saveService;
	@Autowired
	private A003saveCheckService A003saveCheckService;
	@Autowired
	private MessageUtil messageUtil;

   /**
	* 登録処理方法 method
	* 
	* @param A003DataCheckEntity
	* @param result
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A003F20091208153604208.do")
	public void A003F20091208153604208 (@Valid A003DataCheckEntity A003DataCheckEntity, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {

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
				errMsg = A003saveCheckService.saveDataCheck(request,A003DataCheckEntity);
				if (StringUtil.isNullOrBlank(errMsg)) {
					A003saveService.A003F20091208153604208(request,A003DataCheckEntity, jsonObj);
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