package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A011;
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
 *      class: A011A011A010iController
 *      Page: 
 * @version
 */

@Controller
public class A011A011A010iController {

	/**
	 * link name:注文管理詳細_注文管理検索 , link id:A011A010i
	 * from:P00013注文管理詳細 , to:P00012注文管理検索
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A011A010i.do")
	public String A011A010i(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A010";
	}
}
