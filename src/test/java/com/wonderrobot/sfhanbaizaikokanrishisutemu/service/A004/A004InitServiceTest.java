package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004.A004InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004InitService
 *      Page: 会社
 * @version

 */public class A004InitServiceTest extends BaseTest {


	@Autowired
	private A004InitService A004InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A004Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A004InitService.A004Init(request, jsonObj);
	}

}