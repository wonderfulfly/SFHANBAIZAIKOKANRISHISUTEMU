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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010W6beforeService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6beforeService
 *      Page: 注文管理検索
 *      Function: 注文管理検索見積書インポートbefore
 * @version

 */public class A010W6beforeServiceTest extends BaseTest {


	@Autowired
	private A010W6beforeService A010W6beforeService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010W6before () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010W6beforeService.A010W6before(request, jsonObj);
	}

}