package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1updateNYUKINMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1updateNYUKINMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1updateNYUKINMEISAIDao
 * @version

 */public class A011PageAfterSave1updateNYUKINMEISAIDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1updateNYUKINMEISAIDao A011PageAfterSave1updateNYUKINMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1updateNYUKINMEISAI () throws Exception {
		double ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI = 0.0;
		String ay3_NYUKINMEISAI_RESHIITOMEISAINO = "1";


		int returnVal = A011PageAfterSave1updateNYUKINMEISAIDao.A011PageAfterSave1updateNYUKINMEISAI(ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI, ay3_NYUKINMEISAI_RESHIITOMEISAINO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}