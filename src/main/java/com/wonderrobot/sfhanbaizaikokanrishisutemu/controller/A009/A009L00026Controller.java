package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A009;
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
 *      class: A009L00026Controller
 *      Page: 
 * @version
 */

@Controller
public class A009L00026Controller {

	/**
	 * link name:入金管理詳細_入金管理検索 , link id:L00026
	 * from:P00011入金管理詳細 , to:P00010入金管理検索
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00026.do")
	public String L00026(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A008";
	}
}
