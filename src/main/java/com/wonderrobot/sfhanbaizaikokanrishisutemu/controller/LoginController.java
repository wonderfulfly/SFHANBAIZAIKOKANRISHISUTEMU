package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller;

import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.security.LoginUser;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.LoginService;
import  com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @project
 *     System
 * @comment
 *      class: LoginController
 *      Page: login
 * @version
 *     1.0.0.1  New regulations
 */
@Controller
public class LoginController {

	@Resource
	private AuthenticationManager authenticationManager;
	
		/**
	 * User information Service
	 */
	@Autowired
	private LoginService LoginService;

	@RequestMapping("login.do")
	@Log
	public void newLogin(@RequestParam("userid") String userid, @RequestParam("pwd") String pwd, HttpServletRequest request, HttpServletResponse response) throws IOException {
		// User authentication
		Authentication authentication = null;
		try {
			// UserDetailsServiceImpl.loadUserByUsername
			authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(userid, pwd));
		} catch (Exception e) {
			if (e instanceof BadCredentialsException) {
				LoggerUtil.error("Password error");
				return;
			} else {
				// Business exception thrown
				throw e;
			}
		}
		
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		HttpSession session = request.getSession();
		session.setAttribute("loginUser", loginUser);
		// languageID setting
		session.setAttribute(SessionConstant.LANGUAGE_ID, "JPN");
		// loginid setting
		session.setAttribute(SessionConstant.USER_ID, loginUser.getUsername());
		session.setAttribute("LOGIN_USER_ID", loginUser.getUsername());
		session.setAttribute(SessionConstant.APP_USER_ID, loginUser.getUsername());
		session.setAttribute("ORGID", loginUser.getGroupId());
		// userflg setting
		session.setAttribute(SessionConstant.USER_FLG, "1");
		session.setAttribute(SessionConstant.PASSWORD, loginUser.getPASSWORD());
		MDC.put(SessionConstant.USER_ID, loginUser.getUsername());
		// Menus that the user can access
		List<String> menu = loginUser.getMenu();
		// Pages that this user can access
		Map<String, String> user_auth_map = loginUser.getUSER_AUTH_MAP();


		JSONWFCObject jsonObj = new JSONWFCObject();
		String returnVal = null;
//		try{
			if(StringUtil.isNullOrBlank(userid)) {
				jsonObj.setScript(JsonConstant.JSONID_RUN_SCRIPT, "alert('IDを入力してください。');");
			} else if(StringUtil.isNullOrBlank(pwd)){
				jsonObj.setScript(JsonConstant.JSONID_RUN_SCRIPT, "alert('パスワードを入力してください。');");
			} else {
				// loginidを設定
				LoginService.setLoginid(userid);
				// passwordを設定
				LoginService.setPassword(pwd);
				// sessionを設定
				LoginService.setSession(session);
				returnVal = LoginService.doLogin();		
				if (returnVal.equals("1")) {
					jsonObj.setScript(JsonConstant.JSONID_RUN_SCRIPT, "location.href='turnToA010.do'");
				}		
			}
//		} catch(Exception e){
//			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
//		}
		response.getWriter().print(jsonObj.toJSONString());
	}

	@RequestMapping("turnToA010.do")
	public String index() {
	  return "A010";
	}
}