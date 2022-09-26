package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A008;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009NYUKINEntity;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008A008A009uController
 *      Page: 
 * @version
 */

@Controller
public class A008A008A009uController {

	/**
	 * link name:入金管理検索_入金管理詳細 , link id:A008A009u
	 * from:P00010入金管理検索 , to:P00011入金管理詳細
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A008A009u.do")
	public String A008A009u(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		String RESHIITONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RYOUSHUUSHONO")));
		String fixValue = "2";
		A009NYUKINEntity NYUKIN = new A009NYUKINEntity();
		NYUKIN.setCHUUBUNSHONO(CHUUBUNSHONO1);
		NYUKIN.setRESHIITONO(RESHIITONO);
		request.setAttribute("KYANSERUFURAGU", fixValue);
		request.setAttribute("NYUKIN", NYUKIN);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A009";
	}
}
