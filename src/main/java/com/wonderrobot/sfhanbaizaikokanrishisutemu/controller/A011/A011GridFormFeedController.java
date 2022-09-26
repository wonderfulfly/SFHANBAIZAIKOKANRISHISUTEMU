package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller.A011;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.PrintWriter;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011GridFormFeedService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.MessageUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.json.JSONWFCObject;

/**
 * @project
 *     
 * @comment
 *      class: A011GridFormFeedController
 * @version

 */

@Controller
public class A011GridFormFeedController {
	@Autowired
	private A011GridFormFeedService A011GridFormFeedService;
	@Autowired
	private MessageUtil messageUtil;

   /**
	* Grid項目処理 method
	* 
	* @param request
	* @param response
	* @throws Exception
	*/
	@RequestMapping("A011GridFormFeed.do")
	public void A011GridFormFeed (HttpServletRequest request, HttpServletResponse response) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			A011GridFormFeedService.A011GridFormFeed(request, response);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}
}