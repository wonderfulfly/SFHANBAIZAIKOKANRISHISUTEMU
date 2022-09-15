package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006.A006InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006InitService
 *      Page: 商品
 * @version

 */public class A006InitServiceTest extends BaseTest {


	@Autowired
	private A006InitService A006InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A006KAISHAMEIInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A006InitService.A006KAISHAMEIInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A006TSUKAMATSUNYUUSAKIInit () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A006InitService.A006TSUKAMATSUNYUUSAKIInit(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A006Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A006InitService.A006Init(request, jsonObj);
	}

}