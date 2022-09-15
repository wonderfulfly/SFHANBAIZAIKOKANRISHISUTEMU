package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A010;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOEntity;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010L00015Controller
 *      Page: 
 * @version
 */

@Controller
public class A010L00015Controller {

	/**
	 * link name:注文管理検索_注文管理詳細 , link id:L00015
	 * from:P00012注文管理検索 , to:P00013注文管理詳細
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00015.do")
	public String L00015(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String CHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		A011TYUMONSYOEntity TYUMONSYO = new A011TYUMONSYOEntity();
		TYUMONSYO.setCHUUBUNSHONO(CHUUBUNSHONO);
		request.setAttribute("TYUMONSYO", TYUMONSYO);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A011";
	}
}
