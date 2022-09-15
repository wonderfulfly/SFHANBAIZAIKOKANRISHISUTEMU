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
 *      class: A011L00022Controller
 *      Page: 
 * @version
 */

@Controller
public class A011L00022Controller {

	/**
	 * link name:注文管理詳細_入金管理詳細 , link id:L00022
	 * from:P00011注文管理詳細 , to:P00009入金管理詳細
	 * 
	 * @return url to
	 * 
	 */
	@RequestMapping("L00022.do")
	public String L00022(HttpServletRequest request, HttpServletResponse response) {
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		String KYAKUSAKIMEISHOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KYAKUSAKI")));
		String TANTOUSHA = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TANTOUSHA")));
		String CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		String CHUUMONHIDZUKE1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUMONHIDZUKE1")));
		String JPYGOUKEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("NYUUKINKINGAKU1")));
		String fixValue = "1";
		A009NYUKINEntity NYUKIN = new A009NYUKINEntity();
		NYUKIN.setKYAKUSAKIID(KYAKUSAKIMEISHOU);
		NYUKIN.setTANTOUSHAID(TANTOUSHA);
		NYUKIN.setCHUUBUNSHONO(CHUUBUNSHONO1);
		NYUKIN.setCHUUMONHIDZUKE(CHUUMONHIDZUKE1);
		NYUKIN.setNYUUKINKINGAKU(StringUtil.changeStringToDouble(JPYGOUKEI));
		request.setAttribute("KYANSERUFURAGU", fixValue);
		request.setAttribute("NYUKIN", NYUKIN);
		request.setAttribute("mode", "2");
		request.setAttribute("actflg", "1");
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		return "A009";
	}
}
