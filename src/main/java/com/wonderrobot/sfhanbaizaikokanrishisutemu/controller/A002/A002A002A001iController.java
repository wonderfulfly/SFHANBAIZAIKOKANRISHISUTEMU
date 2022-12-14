package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A002;
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
 *      class: A002A002A001iController
 *      Page: 
 * @version
 */

@Controller
public class A002A002A001iController {

	/**
	 * link name:社員検索_社員 , link id:A002A001i
	 * from:P00002社員検索 , to:P00001社員
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A002A001i.do")
	public String A002A001i(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "2");
		request.setAttribute("actflg", "1");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A001";
	}
}
