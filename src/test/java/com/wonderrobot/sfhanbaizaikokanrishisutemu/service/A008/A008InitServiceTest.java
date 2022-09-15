package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008.A008InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008InitService
 *      Page: 入金管理検索
 * @version

 */public class A008InitServiceTest extends BaseTest {


	@Autowired
	private A008InitService A008InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A008KYAKUSAKIInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A008InitService.A008KYAKUSAKIInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A008TANTOUSHAIDInit () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A008InitService.A008TANTOUSHAIDInit(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A008KYAKUSAKIIDInit () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A008InitService.A008KYAKUSAKIIDInit(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A008Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A008InitService.A008Init(request, jsonObj);
	}

}