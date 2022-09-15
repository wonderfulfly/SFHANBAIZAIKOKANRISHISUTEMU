package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A010;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010grdC10AD101ClickService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LogFourJUtil;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010W6afterService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010W6beforeService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010InitService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010H8grdC10SmartSearchService;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DataCheckEntity;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010Controller
 *      Page: 注文管理検索
 * @version

 */

@Controller
public class A010Controller {
	@Autowired
	private A010grdC10AD101ClickService A010grdC10AD101ClickService;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private A010W6afterService A010W6afterService;
	@Autowired
	private A010W6beforeService A010W6beforeService;
	@Autowired
	private A010InitService A010InitService;
	@Autowired
	private A010H8grdC10SmartSearchService A010H8grdC10SmartSearchService;

   /**
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A010grdC10AD101Click.do")
	public void A010grdC10AD101Click (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理検索", request);
			
			A010grdC10AD101ClickService.A010grdC10AD101Click(request, jsonObj);
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
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A010W6after.do")
	public void A010W6after (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理検索", request);
			
			A010W6afterService.A010W6after(request, jsonObj);
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
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A010W6before.do")
	public void A010W6before (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理検索", request);
			
			A010W6beforeService.A010W6before(request, jsonObj);
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
	* 画面初期処理 method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A010Init.do")
	public void A010Init (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理検索", request);
			
			A010InitService.A010Init(request, jsonObj);
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
	* @param A010DataCheckEntity
	* @param result
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A010H8grdC10SmartSearch.do")
	public void A010H8grdC10SmartSearch (@Valid A010DataCheckEntity A010DataCheckEntity, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理検索", request);
			
			if (result.hasFieldErrors()) {
				String messageError = messageUtil.message(result.getFieldError().getDefaultMessage());
				jsonObj.setMessageValue(JsonConstant.JSONID_ERR, messageError);
			} else {
				A010H8grdC10SmartSearchService.A010H8grdC10SmartSearch(request, jsonObj);
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