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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010grdC10AD101ClickService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickService
 *      Page: 注文管理検索
 *      Function: 注文管理検索削除確認_Click
 * @version

 */public class A010grdC10AD101ClickServiceTest extends BaseTest {


	@Autowired
	private A010grdC10AD101ClickService A010grdC10AD101ClickService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A010grdC10AD101Click () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A010grdC10AD101ClickService.A010grdC10AD101Click(request, jsonObj);
	}

}