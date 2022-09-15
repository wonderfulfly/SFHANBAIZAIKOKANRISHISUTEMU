package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008.A008M6grdB8SmartSearchService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008M6grdB8SmartSearchService
 *      Page: 入金管理検索
 * @version

 */public class A008M6grdB8SmartSearchServiceTest extends BaseTest {


	@Autowired
	private A008M6grdB8SmartSearchService A008M6grdB8SmartSearchService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A008M6grdB8SmartSearch () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A008M6grdB8SmartSearchService.A008M6grdB8SmartSearch(request, jsonObj);
	}

}