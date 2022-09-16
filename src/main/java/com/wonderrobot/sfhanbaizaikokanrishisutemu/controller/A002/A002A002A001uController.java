package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A002;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wonderfulfly.core.util.log.LoggerUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001SYAINEntity;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002A002A001uController
 *      Page: 
 * @version
 */

@Controller
public class A002A002A001uController {

	/**
	 * link name:社員検索_社員 , link id:A002A001u
	 * from:P00002社員検索 , to:P00001社員
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("A002A001u.do")
	public String A002A001u(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String SHAINID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHAINID1")));
		String ROGUINID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ROGUINID1")));
		A001SYAINEntity SYAIN = new A001SYAINEntity();
		SYAIN.setSHAINID(SHAINID1);
		SYAIN.setROGUINID(ROGUINID);
		request.setAttribute("SYAIN", SYAIN);
		request.setAttribute("mode", "1");
		request.setAttribute("actflg", "2");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A001";
	}
}
