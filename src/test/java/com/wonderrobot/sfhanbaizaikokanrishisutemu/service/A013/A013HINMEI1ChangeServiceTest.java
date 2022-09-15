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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013HINMEI1ChangeService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013HINMEI1ChangeService
 *      Page: 部品管理画面
 *      Function: 部品管理画面品名_Change
 * @version

 */public class A013HINMEI1ChangeServiceTest extends BaseTest {


	@Autowired
	private A013HINMEI1ChangeService A013HINMEI1ChangeService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013HINMEI1Change () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013HINMEI1ChangeService.A013HINMEI1Change(request, jsonObj);
	}

}