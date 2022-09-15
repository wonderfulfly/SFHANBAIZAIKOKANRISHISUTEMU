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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.honnzonngosyoriService;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriService
 *      Page: 部品管理画面
 *      Function: 部品管理画面PageAfterSave
 * @version

 */public class honnzonngosyoriServiceTest extends BaseTest {


	@Autowired
	private honnzonngosyoriService honnzonngosyoriService;
	/**
	 * Test Methods
	 *
	 */
    @Test
	public void honnzonngosyori () throws Exception {
		HttpServletRequest request = null; 
		JSONWFCObject jsonObj = null; 


		honnzonngosyoriService.honnzonngosyori(request, jsonObj);
	}

}