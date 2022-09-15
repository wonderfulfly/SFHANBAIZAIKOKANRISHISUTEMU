package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009.A009PageAfterLoad1Service;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterLoad1Service
 *      Page: 入金管理詳細
 *      Function: 入金管理詳細PageAfterLoad
 * @version

 */public class A009PageAfterLoad1ServiceTest extends BaseTest {


	@Autowired
	private A009PageAfterLoad1Service A009PageAfterLoad1Service;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A009PageAfterLoad1 () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A009PageAfterLoad1Service.A009PageAfterLoad1(request, jsonObj);
	}

}