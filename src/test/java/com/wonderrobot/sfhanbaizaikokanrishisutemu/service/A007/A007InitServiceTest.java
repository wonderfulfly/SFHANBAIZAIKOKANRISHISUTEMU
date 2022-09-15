package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007.A007InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007InitService
 *      Page: 商品入庫画面
 * @version

 */public class A007InitServiceTest extends BaseTest {


	@Autowired
	private A007InitService A007InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A007TSUKAMATSUNYUUSAKIInit () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A007InitService.A007TSUKAMATSUNYUUSAKIInit(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A007Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A007InitService.A007Init(request, jsonObj);
	}

}