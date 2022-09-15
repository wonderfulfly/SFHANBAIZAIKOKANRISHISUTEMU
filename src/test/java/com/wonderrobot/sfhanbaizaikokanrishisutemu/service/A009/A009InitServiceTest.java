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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009.A009InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009InitService
 *      Page: 入金管理詳細
 * @version

 */public class A009InitServiceTest extends BaseTest {


	@Autowired
	private A009InitService A009InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A009KYAKUSAKIInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A009InitService.A009KYAKUSAKIInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A009TANTOUSHAInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A009InitService.A009TANTOUSHAInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A009KANTOKU1Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A009InitService.A009KANTOKU1Init(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A009Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A009InitService.A009Init(request, jsonObj);
	}

}