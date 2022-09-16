package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A015;
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
 *      class: A015A015A004iController
 *      Page: 
 * @version
 */

@Controller
public class A015A015A004iController {

	/**
	 * link name:会社検索_会社 , link id:A015A004i
	 * from:P00006会社検索 , to:P00005会社
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A015A004i.do")
	public String A015A004i(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		request.setAttribute("mode", "2");
		request.setAttribute("actflg", "1");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A004";
	}
}
