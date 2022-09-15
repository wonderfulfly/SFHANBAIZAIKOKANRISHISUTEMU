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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013T7afterService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterService
 *      Page: 部品管理画面
 *      Function: 部品管理画面部品詳細インポートafter
 * @version

 */public class A013T7afterServiceTest extends BaseTest {


	@Autowired
	private A013T7afterService A013T7afterService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013T7after () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013T7afterService.A013T7after(request, jsonObj);
	}

}