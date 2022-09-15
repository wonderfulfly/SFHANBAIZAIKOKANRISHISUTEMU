package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A011;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINEntity;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011L00025Controller
 *      Page: 
 * @version
 */

@Controller
public class A011L00025Controller {

	/**
	 * link name:注文管理詳細_部品管理画面 , link id:L00025
	 * from:P00011注文管理詳細 , to:P00012部品管理画面
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00025.do")
	public String L00025(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
		String CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		String SHANAIKOUJIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		String SHANAIKOUJIBANGOU11 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHANAIKOUJIBANGOU")));
		A013BUHINEntity BUHIN = new A013BUHINEntity();
		BUHIN.setCHUUBUNSHONO(CHUUBUNSHONO1);
		BUHIN.setCHUUBUNSHOMEISAINO(CHUUBUNSHOMEISAINO);
		BUHIN.setKOUJIKANRIBANGOU(SHANAIKOUJIBANGOU1);
		request.setAttribute("SHANAIKOUJIBANGOU", SHANAIKOUJIBANGOU11);
		request.setAttribute("BUHIN", BUHIN);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A013";
	}
}
