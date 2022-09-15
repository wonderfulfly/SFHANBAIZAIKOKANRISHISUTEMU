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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010W6afterService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterService
 *      Page: 注文管理検索
 *      Function: 注文管理検索見積書インポートafter
 * @version

 */public class A010W6afterServiceTest extends BaseTest {


	@Autowired
	private A010W6afterService A010W6afterService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010W6after () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010W6afterService.A010W6after(request, jsonObj);
	}

}