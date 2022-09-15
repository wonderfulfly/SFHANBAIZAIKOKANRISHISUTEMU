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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011InitService
 *      Page: 注文管理詳細
 * @version

 */public class A011InitServiceTest extends BaseTest {


	@Autowired
	private A011InitService A011InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A011KYAKUSAKIMEISHOUInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A011InitService.A011KYAKUSAKIMEISHOUInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A011TANTOUSHAInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A011InitService.A011TANTOUSHAInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A011Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A011InitService.A011Init(request, jsonObj);
	}

}