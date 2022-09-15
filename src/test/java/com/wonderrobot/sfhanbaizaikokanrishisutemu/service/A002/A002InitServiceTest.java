package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A002;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A002.A002InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002InitService
 *      Page: 社員検索
 * @version

 */public class A002InitServiceTest extends BaseTest {


	@Autowired
	private A002InitService A002InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A002YUUZAAKENGENInit () throws Exception {
		String selectedVaule = null; 
		JSONWFCObject jsonObj = null; 


		A002InitService.A002YUUZAAKENGENInit(selectedVaule, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A002Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A002InitService.A002Init(request, jsonObj);
	}

}