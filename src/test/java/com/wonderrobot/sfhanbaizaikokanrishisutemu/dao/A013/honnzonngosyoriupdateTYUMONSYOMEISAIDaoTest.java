package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriupdateTYUMONSYOMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriupdateTYUMONSYOMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriupdateTYUMONSYOMEISAIDao
 * @version

 */public class honnzonngosyoriupdateTYUMONSYOMEISAIDaoTest extends BaseTest {


	@Autowired
	private honnzonngosyoriupdateTYUMONSYOMEISAIDao honnzonngosyoriupdateTYUMONSYOMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void honnzonngosyoriupdateTYUMONSYOMEISAI () throws Exception {
		double JPYGOUKEI1 = 0.0;
		double RMBGOUKEI1 = 0.0;
		double USDGOUKEI1 = 0.0;
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";


		int returnVal = honnzonngosyoriupdateTYUMONSYOMEISAIDao.honnzonngosyoriupdateTYUMONSYOMEISAI(JPYGOUKEI1, RMBGOUKEI1, USDGOUKEI1, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}