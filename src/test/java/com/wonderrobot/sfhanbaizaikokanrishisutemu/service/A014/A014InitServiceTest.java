package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A014;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A014.A014InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014InitService
 *      Page: 部門検索
 * @version

 */public class A014InitServiceTest extends BaseTest {


	@Autowired
	private A014InitService A014InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A014Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A014InitService.A014Init(request, jsonObj);
	}

}