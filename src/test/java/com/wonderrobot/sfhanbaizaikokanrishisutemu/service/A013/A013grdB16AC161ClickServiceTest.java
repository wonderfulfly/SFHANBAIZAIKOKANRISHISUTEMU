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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013grdB16AC161ClickService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickService
 *      Page: 部品管理画面
 *      Function: 部品管理画面確定_Click
 * @version

 */public class A013grdB16AC161ClickServiceTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickService A013grdB16AC161ClickService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013grdB16AC161Click () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013grdB16AC161ClickService.A013grdB16AC161Click(request, jsonObj);
	}

}