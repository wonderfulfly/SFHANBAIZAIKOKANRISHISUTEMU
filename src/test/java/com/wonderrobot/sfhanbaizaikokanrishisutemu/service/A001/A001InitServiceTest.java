package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A001.A001InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001InitService
 *      Page: 社員
 * @version

 */public class A001InitServiceTest extends BaseTest {


	@Autowired
	private A001InitService A001InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A001BUMONInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A001InitService.A001BUMONInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A001Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A001InitService.A001Init(request, jsonObj);
	}

}