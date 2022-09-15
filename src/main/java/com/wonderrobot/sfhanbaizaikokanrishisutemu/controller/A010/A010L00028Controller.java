package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A010;
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
 *      class: A010L00028Controller
 *      Page: 
 * @version
 */

@Controller
public class A010L00028Controller {

	/**
	 * link name:注文管理検索_注文管理詳細 , link id:L00028
	 * from:P00012注文管理検索 , to:P00013注文管理詳細
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00028.do")
	public String L00028(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "2");
		request.setAttribute("actflg", "1");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A011";
	}
}
