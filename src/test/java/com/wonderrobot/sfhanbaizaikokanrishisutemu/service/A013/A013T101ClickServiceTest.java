package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013T101ClickService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickService
 *      Page: 部品管理画面
 *      Function: 部品管理画面全部確定_Click
 * @version

 */public class A013T101ClickServiceTest extends BaseTest {


	@Autowired
	private A013T101ClickService A013T101ClickService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013T101Click () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013T101ClickService.A013T101Click(request, jsonObj);
	}

}