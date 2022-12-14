package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A015;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004KAISYAEntity;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A015A015A004uController
 *      Page: 
 * @version
 */

@Controller
public class A015A015A004uController {

	/**
	 * link name:会社検索_会社 , link id:A015A004u
	 * from:P00006会社検索 , to:P00005会社
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A015A004u.do")
	public String A015A004u(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String KAISHAID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAID1")));
		A004KAISYAEntity KAISYA = new A004KAISYAEntity();
		KAISYA.setKAISHAID(KAISHAID1);
		request.setAttribute("KAISYA", KAISYA);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A004";
	}
}
