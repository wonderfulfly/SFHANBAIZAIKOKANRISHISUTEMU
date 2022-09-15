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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013AA71Service;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AA71Service
 *      Page: 部品管理画面
 *      Function: 部品管理画面処理済リストClick
 * @version

 */public class A013AA71ServiceTest extends BaseTest {


	@Autowired
	private A013AA71Service A013AA71Service;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013AA71 () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013AA71Service.A013AA71(request, jsonObj);
	}

}