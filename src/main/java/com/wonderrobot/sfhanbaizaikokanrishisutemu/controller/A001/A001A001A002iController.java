package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A001;
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
 *      class: A001A001A002iController
 *      Page: 
 * @version
 */

@Controller
public class A001A001A002iController {

	/**
	 * link name:社員_社員検索 , link id:A001A002i
	 * from:P00001社員 , to:P00002社員検索
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A001A002i.do")
	public String A001A002i(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A002";
	}
}
