package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A006;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006.A006InitService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LogFourJUtil;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006.A006S4grdB6SmartSearchService;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006DataCheckEntity;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Controller
 *      Page: 商品
 * @version

 */

@Controller
public class A006Controller {
	@Autowired
	private A006InitService A006InitService;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private A006S4grdB6SmartSearchService A006S4grdB6SmartSearchService;

   /**
	* 画面初期処理 method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A006Init.do")
	public void A006Init (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("商品", request);
			
			A006InitService.A006Init(request, jsonObj);
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
	* 
	* @param A006DataCheckEntity
	* @param result
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A006S4grdB6SmartSearch.do")
	public void A006S4grdB6SmartSearch (@Valid A006DataCheckEntity A006DataCheckEntity, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("商品", request);
			
			if (result.hasFieldErrors()) {
				String messageError = messageUtil.message(result.getFieldError().getDefaultMessage());
				jsonObj.setMessageValue(JsonConstant.JSONID_ERR, messageError);
			} else {
				A006S4grdB6SmartSearchService.A006S4grdB6SmartSearch(request, jsonObj);
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