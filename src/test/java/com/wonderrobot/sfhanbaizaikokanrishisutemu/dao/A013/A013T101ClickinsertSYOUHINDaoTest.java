package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickinsertSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickinsertSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickinsertSYOUHINDao
 * @version

 */public class A013T101ClickinsertSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A013T101ClickinsertSYOUHINDao A013T101ClickinsertSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T101ClickinsertSYOUHIN () throws Exception {
		String SHOUHINNUMBER = "1";
		String ay3_BUHINSYOUSAI_HINMEI = "1";
		String ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = "1";
		String ay3_BUHINSYOUSAI_ZAISHITSU = "1";
		double ay3_BUHINSYOUSAI_KOUNYUUTANKA = 0.0;
		int ay3_BUHINSYOUSAI_SOUKOSUU = 0;
		String ay3_BUHINSYOUSAI_NYUUKABI = "1";


		int returnVal = A013T101ClickinsertSYOUHINDao.A013T101ClickinsertSYOUHIN(SHOUHINNUMBER, ay3_BUHINSYOUSAI_HINMEI, ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay3_BUHINSYOUSAI_ZAISHITSU, ay3_BUHINSYOUSAI_KOUNYUUTANKA, ay3_BUHINSYOUSAI_SOUKOSUU, ay3_BUHINSYOUSAI_NYUUKABI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}