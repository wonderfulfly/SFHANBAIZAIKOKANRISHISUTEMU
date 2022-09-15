package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006.A006S4grdB6SmartSearchService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006S4grdB6SmartSearchService
 *      Page: 商品
 * @version

 */public class A006S4grdB6SmartSearchServiceTest extends BaseTest {


	@Autowired
	private A006S4grdB6SmartSearchService A006S4grdB6SmartSearchService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A006S4grdB6SmartSearch () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A006S4grdB6SmartSearchService.A006S4grdB6SmartSearch(request, jsonObj);
	}

}