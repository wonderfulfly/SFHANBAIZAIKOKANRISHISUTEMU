package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013P00012194grdB16SmartSearchService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013P00012194grdB16SmartSearchService
 *      Page: 部品管理画面
 * @version

 */public class A013P00012194grdB16SmartSearchServiceTest extends BaseTest {


	@Autowired
	private A013P00012194grdB16SmartSearchService A013P00012194grdB16SmartSearchService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013P00012194grdB16SmartSearch () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013P00012194grdB16SmartSearchService.A013P00012194grdB16SmartSearch(request, jsonObj);
	}

}