package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A011;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011grdB181ChangeService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LogFourJUtil;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011grdB18W181ClickService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011KYAKUSAKIMEISHOU1ChangeService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011PageAfterLoad1Service;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011PageAfterSave1Service;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011W41ClickService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011W61ClickService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Controller
 *      Page: 注文管理詳細
 * @version

 */

@Controller
public class A011Controller {
	@Autowired
	private A011grdB181ChangeService A011grdB181ChangeService;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private A011grdB18W181ClickService A011grdB18W181ClickService;
	@Autowired
	private A011KYAKUSAKIMEISHOU1ChangeService A011KYAKUSAKIMEISHOU1ChangeService;
	@Autowired
	private A011PageAfterLoad1Service A011PageAfterLoad1Service;
	@Autowired
	private A011PageAfterSave1Service A011PageAfterSave1Service;
	@Autowired
	private A011W41ClickService A011W41ClickService;
	@Autowired
	private A011W61ClickService A011W61ClickService;
	@Autowired
	private A011InitService A011InitService;

   /**
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A011grdB181Change.do")
	public void A011grdB181Change (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011grdB181ChangeService.A011grdB181Change(request, jsonObj);
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
	@RequestMapping("A011grdB18W181Click.do")
	public void A011grdB18W181Click (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011grdB18W181ClickService.A011grdB18W181Click(request, jsonObj);
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
	@RequestMapping("A011KYAKUSAKIMEISHOU1Change.do")
	public void A011KYAKUSAKIMEISHOU1Change (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011KYAKUSAKIMEISHOU1ChangeService.A011KYAKUSAKIMEISHOU1Change(request, jsonObj);
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
	@RequestMapping("A011PageAfterLoad1.do")
	public void A011PageAfterLoad1 (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011PageAfterLoad1Service.A011PageAfterLoad1(request, jsonObj);
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
	@RequestMapping("A011PageAfterSave1.do")
	public void A011PageAfterSave1 (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011PageAfterSave1Service.A011PageAfterSave1(request, jsonObj);
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
	@RequestMapping("A011W41Click.do")
	public void A011W41Click (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011W41ClickService.A011W41Click(request, jsonObj);
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
	@RequestMapping("A011W61Click.do")
	public void A011W61Click (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011W61ClickService.A011W61Click(request, jsonObj);
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
	@RequestMapping("A011Init.do")
	public void A011Init (HttpServletRequest request, HttpServletResponse response) throws Exception {

		PrintWriter out = null;
		JSONWFCObject jsonObj = null;
		String jsonObjStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			jsonObj = new JSONWFCObject();
			LogFourJUtil.putMDC("注文管理詳細", request);
			
			A011InitService.A011Init(request, jsonObj);
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