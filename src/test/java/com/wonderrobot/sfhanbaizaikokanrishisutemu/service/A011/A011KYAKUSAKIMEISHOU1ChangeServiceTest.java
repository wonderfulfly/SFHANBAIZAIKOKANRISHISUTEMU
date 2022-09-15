package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011KYAKUSAKIMEISHOU1ChangeService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011KYAKUSAKIMEISHOU1ChangeService
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細客先名称_Change
 * @version

 */public class A011KYAKUSAKIMEISHOU1ChangeServiceTest extends BaseTest {


	@Autowired
	private A011KYAKUSAKIMEISHOU1ChangeService A011KYAKUSAKIMEISHOU1ChangeService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A011KYAKUSAKIMEISHOU1Change () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A011KYAKUSAKIMEISHOU1ChangeService.A011KYAKUSAKIMEISHOU1Change(request, jsonObj);
	}

}