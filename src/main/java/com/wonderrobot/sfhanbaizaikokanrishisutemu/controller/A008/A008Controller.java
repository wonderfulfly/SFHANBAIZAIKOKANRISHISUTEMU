package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A008;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008.A008InitService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LogFourJUtil;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008.A008I6grdB8SmartSearchService;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008.A008M6grdB8SmartSearchService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008Controller
 *      Page: 入金管理検索
 * @version

 */

@Controller
public class A008Controller {
	@Autowired
	private A008InitService A008InitService;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private A008I6grdB8SmartSearchService A008I6grdB8SmartSearchService;
	@Autowired
	private A008M6grdB8SmartSearchService A008M6grdB8SmartSearchService;

   /**
	* 画面初期処理 method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A008Init.do")
	public void A008Init (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("入金管理検索", request);
			
			A008InitService.A008Init(request, jsonObj);
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
	* @param A008DataCheckEntity
	* @param result
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A008I6grdB8SmartSearch.do")
	public void A008I6grdB8SmartSearch (@Valid A008DataCheckEntity A008DataCheckEntity, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("入金管理検索", request);
			
			if (result.hasFieldErrors()) {
				String messageError = messageUtil.message(result.getFieldError().getDefaultMessage());
				jsonObj.setMessageValue(JsonConstant.JSONID_ERR, messageError);
			} else {
				A008I6grdB8SmartSearchService.A008I6grdB8SmartSearch(request, jsonObj);
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

   /**
	* 
	* @param A008DataCheckEntity
	* @param result
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A008M6grdB8SmartSearch.do")
	public void A008M6grdB8SmartSearch (@Valid A008DataCheckEntity A008DataCheckEntity, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("入金管理検索", request);
			
			if (result.hasFieldErrors()) {
				String messageError = messageUtil.message(result.getFieldError().getDefaultMessage());
				jsonObj.setMessageValue(JsonConstant.JSONID_ERR, messageError);
			} else {
				A008M6grdB8SmartSearchService.A008M6grdB8SmartSearch(request, jsonObj);
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