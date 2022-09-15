package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A009;
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
 *      class: A009L00041Controller
 *      Page: 
 * @version
 */

@Controller
public class A009L00041Controller {

	/**
	 * link name:入金管理詳細_注文管理詳細 , link id:L00041
	 * from:P00011入金管理詳細 , to:P00013注文管理詳細
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00041.do")
	public String L00041(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		A011TYUMONSYOEntity TYUMONSYO = new A011TYUMONSYOEntity();
		TYUMONSYO.setCHUUBUNSHONO(CHUUBUNSHONO1);
		request.setAttribute("TYUMONSYO", TYUMONSYO);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A011";
	}
}
