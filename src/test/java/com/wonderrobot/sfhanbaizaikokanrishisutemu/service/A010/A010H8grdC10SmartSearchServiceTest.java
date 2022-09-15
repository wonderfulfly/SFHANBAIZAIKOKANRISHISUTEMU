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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010H8grdC10SmartSearchService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010H8grdC10SmartSearchService
 *      Page: 注文管理検索
 * @version

 */public class A010H8grdC10SmartSearchServiceTest extends BaseTest {


	@Autowired
	private A010H8grdC10SmartSearchService A010H8grdC10SmartSearchService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010H8grdC10SmartSearch () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010H8grdC10SmartSearchService.A010H8grdC10SmartSearch(request, jsonObj);
	}

}