package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A005;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A005.A005InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A005InitService
 *      Page: データインタフェース
 * @version

 */public class A005InitServiceTest extends BaseTest {


	@Autowired
	private A005InitService A005InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A005Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A005InitService.A005Init(request, jsonObj);
	}

}