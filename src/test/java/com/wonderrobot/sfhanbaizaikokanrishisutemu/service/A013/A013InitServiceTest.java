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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013InitService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013InitService
 *      Page: 部品管理画面
 * @version

 */public class A013InitServiceTest extends BaseTest {


	@Autowired
	private A013InitService A013InitService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013TANTOUSHA1Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013InitService.A013TANTOUSHA1Init(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013TANTOUInit () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013InitService.A013TANTOUInit(request, jsonObj);
	}
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void A013Init () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		A013InitService.A013Init(request, jsonObj);
	}

}