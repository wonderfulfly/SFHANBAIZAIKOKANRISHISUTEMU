package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A011;
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
 *      class: A011L00045Controller
 *      Page: 
 * @version
 */

@Controller
public class A011L00045Controller {

	/**
	 * link name:注文管理詳細_入金管理詳細 , link id:L00045
	 * from:P00013注文管理詳細 , to:P00011入金管理詳細
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00045.do")
	public String L00045(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String RESHIITONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RYOUSHUUSHONO")));
		String CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		String fixValue = "1";
		A009NYUKINEntity NYUKIN = new A009NYUKINEntity();
		NYUKIN.setRESHIITONO(RESHIITONO);
		NYUKIN.setCHUUBUNSHONO(CHUUBUNSHONO1);
		request.setAttribute("KYANSERUFURAGU", fixValue);
		request.setAttribute("NYUKIN", NYUKIN);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A009";
	}
}
