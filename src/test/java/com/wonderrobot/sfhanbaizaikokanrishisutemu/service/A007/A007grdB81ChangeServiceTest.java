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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007.A007grdB81ChangeService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB81ChangeService
 *      Page: 商品入庫画面
 *      Function: 商品入庫画面grdB8_Change
 * @version

 */public class A007grdB81ChangeServiceTest extends BaseTest {


	@Autowired
	private A007grdB81ChangeService A007grdB81ChangeService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A007grdB81Change () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A007grdB81ChangeService.A007grdB81Change(request, jsonObj);
	}

}