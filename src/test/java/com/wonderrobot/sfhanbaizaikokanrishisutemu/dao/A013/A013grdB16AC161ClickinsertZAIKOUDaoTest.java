package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickinsertZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickinsertZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickinsertZAIKOUDao
 * @version

 */public class A013grdB16AC161ClickinsertZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickinsertZAIKOUDao A013grdB16AC161ClickinsertZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013grdB16AC161ClickinsertZAIKOU () throws Exception {
		String ay6_BUHINSYOUSAI_HINMEI = "1";
		String TOUJITSU = "1";
		String ay6_BUHINSYOUSAI_CHUUBUNSHONO = "1";
		String ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO = "1";
		String ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU = "1";
		String ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = "1";
		double ay6_BUHINSYOUSAI_SHOUKEI = 0.0;
		String SHUKKANO1 = "1";
		int ay6_BUHINSYOUSAI_SOUKOSUU = 0;
		String ZAIKONOautoNum = "1";
		double ay6_BUHINSYOUSAI_KOUNYUUTANKA = 0.0;
		String ay6_BUHINSYOUSAI_HINBANNO = "1";


		int returnVal = A013grdB16AC161ClickinsertZAIKOUDao.A013grdB16AC161ClickinsertZAIKOU(ay6_BUHINSYOUSAI_HINMEI, TOUJITSU, ay6_BUHINSYOUSAI_CHUUBUNSHONO, ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO, ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU, ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay6_BUHINSYOUSAI_SHOUKEI, SHUKKANO1, ay6_BUHINSYOUSAI_SOUKOSUU, ZAIKONOautoNum, ay6_BUHINSYOUSAI_KOUNYUUTANKA, ay6_BUHINSYOUSAI_HINBANNO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}