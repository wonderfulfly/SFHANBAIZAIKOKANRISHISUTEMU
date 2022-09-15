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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013AV101ClickService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AV101ClickService
 *      Page: 部品管理画面
 *      Function: 部品管理画面確定権限制限_Click
 * @version

 */public class A013AV101ClickServiceTest extends BaseTest {


	@Autowired
	private A013AV101ClickService A013AV101ClickService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013AV101Click () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013AV101ClickService.A013AV101Click(request, jsonObj);
	}

}