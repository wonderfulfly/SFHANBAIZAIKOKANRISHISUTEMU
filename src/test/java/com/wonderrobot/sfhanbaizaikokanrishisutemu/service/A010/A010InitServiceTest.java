package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010InitService
 *      Page: 注文管理検索
 * @version

 */public class A010InitServiceTest extends BaseTest {


	@Autowired
	private A010InitService A010InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010TANTOUSHAIDInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010InitService.A010TANTOUSHAIDInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010KYAKUSAKIIDInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010InitService.A010KYAKUSAKIIDInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010KYAKUSAKIID1Init () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A010InitService.A010KYAKUSAKIID1Init(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010TANTOUSHAID1Init () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A010InitService.A010TANTOUSHAID1Init(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010InitService.A010Init(request, jsonObj);
	}

}