package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A014;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014A014A003iController
 *      Page: 
 * @version
 */

@Controller
public class A014A014A003iController {

	/**
	 * link name:部門検索_部門 , link id:A014A003i
	 * from:P00004部門検索 , to:P00003部門
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A014A003i.do")
	public String A014A003i(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "2");
		request.setAttribute("actflg", "1");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A003";
	}
}
