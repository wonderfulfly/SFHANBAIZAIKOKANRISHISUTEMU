package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickinsertZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickinsertZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickinsertZAIKOUDao
 * @version

 */public class A013T101ClickinsertZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A013T101ClickinsertZAIKOUDao A013T101ClickinsertZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T101ClickinsertZAIKOU () throws Exception {
		String ay3_BUHINSYOUSAI_HINMEI = "1";
		String TOUJITSU = "1";
		String ay3_BUHINSYOUSAI_CHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU = "1";
		String ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = "1";
		double ay3_BUHINSYOUSAI_SHOUKEI = 0.0;
		String SHUKKANO1 = "1";
		int ay3_BUHINSYOUSAI_SOUKOSUU = 0;
		String ZAIKONOautoNum = "1";
		double ay3_BUHINSYOUSAI_KOUNYUUTANKA = 0.0;
		String ay3_BUHINSYOUSAI_HINBANNO = "1";


		int returnVal = A013T101ClickinsertZAIKOUDao.A013T101ClickinsertZAIKOU(ay3_BUHINSYOUSAI_HINMEI, TOUJITSU, ay3_BUHINSYOUSAI_CHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU, ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay3_BUHINSYOUSAI_SHOUKEI, SHUKKANO1, ay3_BUHINSYOUSAI_SOUKOSUU, ZAIKONOautoNum, ay3_BUHINSYOUSAI_KOUNYUUTANKA, ay3_BUHINSYOUSAI_HINBANNO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}