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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007.A007Y61ClickService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007Y61ClickService
 *      Page: 商品入庫画面
 *      Function: 商品入庫画面検索_Click
 * @version

 */public class A007Y61ClickServiceTest extends BaseTest {


	@Autowired
	private A007Y61ClickService A007Y61ClickService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A007Y61Click () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A007Y61ClickService.A007Y61Click(request, jsonObj);
	}

}