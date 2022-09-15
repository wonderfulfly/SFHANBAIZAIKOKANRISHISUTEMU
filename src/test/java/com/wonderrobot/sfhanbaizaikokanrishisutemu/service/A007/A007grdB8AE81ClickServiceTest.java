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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007.A007grdB8AE81ClickService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickService
 *      Page: 商品入庫画面
 *      Function: 商品入庫画面入庫_Click
 * @version

 */public class A007grdB8AE81ClickServiceTest extends BaseTest {


	@Autowired
	private A007grdB8AE81ClickService A007grdB8AE81ClickService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A007grdB8AE81Click () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A007grdB8AE81ClickService.A007grdB8AE81Click(request, jsonObj);
	}

}