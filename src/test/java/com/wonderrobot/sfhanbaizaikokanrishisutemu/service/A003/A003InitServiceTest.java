package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003.A003InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003InitService
 *      Page: 部門
 * @version

 */public class A003InitServiceTest extends BaseTest {


	@Autowired
	private A003InitService A003InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A003Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A003InitService.A003Init(request, jsonObj);
	}

}