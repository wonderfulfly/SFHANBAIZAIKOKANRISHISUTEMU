package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickinsertZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickinsertZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickinsertZAIKOUDao
 * @version

 */public class A011W41ClickinsertZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A011W41ClickinsertZAIKOUDao A011W41ClickinsertZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011W41ClickinsertZAIKOU () throws Exception {
		String ay1_ZAIKOU_SHOUHINMEISHOU = "1";
		String KYOU = "1";
		String ay1_ZAIKOU_CHUUBUNSHOMEISAINO = "1";
		String ay1_ZAIKOU_KOUJIKANRIBANGOU = "1";
		String ay1_ZAIKOU_TSUKAMATSUNYUUSAKI = "1";
		double SHOUKEI = 0.0;
		String SHUKKANO1 = "1";
		int ay1_ZAIKOU_SUURYOU = 0;
		String ZAIKONOautoNum = "1";
		double ay1_ZAIKOU_PRICE = 0.0;
		String ay1_ZAIKOU_HINBANNO = "1";


		int returnVal = A011W41ClickinsertZAIKOUDao.A011W41ClickinsertZAIKOU(ay1_ZAIKOU_SHOUHINMEISHOU, KYOU, ay1_ZAIKOU_CHUUBUNSHOMEISAINO, ay1_ZAIKOU_KOUJIKANRIBANGOU, ay1_ZAIKOU_TSUKAMATSUNYUUSAKI, SHOUKEI, SHUKKANO1, ay1_ZAIKOU_SUURYOU, ZAIKONOautoNum, ay1_ZAIKOU_PRICE, ay1_ZAIKOU_HINBANNO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}