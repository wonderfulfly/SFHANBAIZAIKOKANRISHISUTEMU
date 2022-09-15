package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011PageAfterSave1Service;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1Service
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細PageAfterSave
 * @version

 */public class A011PageAfterSave1ServiceTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1Service A011PageAfterSave1Service;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A011PageAfterSave1 () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A011PageAfterSave1Service.A011PageAfterSave1(request, jsonObj);
	}

}