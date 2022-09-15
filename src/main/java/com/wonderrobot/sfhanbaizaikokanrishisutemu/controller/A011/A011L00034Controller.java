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
 *      class: A011L00034Controller
 *      Page: 
 * @version
 */

@Controller
public class A011L00034Controller {

	/**
	 * link name:注文管理詳細_注文管理検索 , link id:L00034
	 * from:P00013注文管理詳細 , to:P00012注文管理検索
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00034.do")
	public String L00034(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A010";
	}
}
