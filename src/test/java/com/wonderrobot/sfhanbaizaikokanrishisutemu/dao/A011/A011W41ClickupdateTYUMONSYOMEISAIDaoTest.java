package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateTYUMONSYOMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateTYUMONSYOMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateTYUMONSYOMEISAIDao
 * @version

 */public class A011W41ClickupdateTYUMONSYOMEISAIDaoTest extends BaseTest {


	@Autowired
	private A011W41ClickupdateTYUMONSYOMEISAIDao A011W41ClickupdateTYUMONSYOMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011W41ClickupdateTYUMONSYOMEISAI () throws Exception {
		String CHUUBUNSHONO1 = "1";


		int returnVal = A011W41ClickupdateTYUMONSYOMEISAIDao.A011W41ClickupdateTYUMONSYOMEISAI(CHUUBUNSHONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}