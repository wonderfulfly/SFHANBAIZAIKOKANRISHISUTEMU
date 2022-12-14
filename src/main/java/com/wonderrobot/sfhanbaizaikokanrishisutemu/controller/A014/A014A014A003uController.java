package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A014;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONEntity;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014A014A003uController
 *      Page: 
 * @version
 */

@Controller
public class A014A014A003uController {

	/**
	 * link name:部門検索_部門 , link id:A014A003u
	 * from:P00004部門検索 , to:P00003部門
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A014A003u.do")
	public String A014A003u(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String BUMONID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUMONID1")));
		A003BUMONEntity BUMON = new A003BUMONEntity();
		BUMON.setBUMONID(BUMONID1);
		request.setAttribute("BUMON", BUMON);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A003";
	}
}
