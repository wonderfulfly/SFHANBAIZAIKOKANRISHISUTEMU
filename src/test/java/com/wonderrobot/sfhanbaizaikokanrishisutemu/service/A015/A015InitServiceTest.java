package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A015;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A015.A015InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A015InitService
 *      Page: 会社検索
 * @version

 */public class A015InitServiceTest extends BaseTest {


	@Autowired
	private A015InitService A015InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A015Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A015InitService.A015Init(request, jsonObj);
	}

}