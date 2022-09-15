package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickinsertSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickinsertSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickinsertSYOUHINDao
 * @version

 */public class A013grdB16AC161ClickinsertSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickinsertSYOUHINDao A013grdB16AC161ClickinsertSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013grdB16AC161ClickinsertSYOUHIN () throws Exception {
		String KETSUGOUMOJI2 = "1";
		String ay6_BUHINSYOUSAI_HINMEI = "1";
		String ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = "1";
		String ay6_BUHINSYOUSAI_ZAISHITSU = "1";
		double ay6_BUHINSYOUSAI_KOUNYUUTANKA = 0.0;
		int ay6_BUHINSYOUSAI_SOUKOSUU = 0;
		String ay6_BUHINSYOUSAI_NYUUKABI = "1";


		int returnVal = A013grdB16AC161ClickinsertSYOUHINDao.A013grdB16AC161ClickinsertSYOUHIN(KETSUGOUMOJI2, ay6_BUHINSYOUSAI_HINMEI, ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay6_BUHINSYOUSAI_ZAISHITSU, ay6_BUHINSYOUSAI_KOUNYUUTANKA, ay6_BUHINSYOUSAI_SOUKOSUU, ay6_BUHINSYOUSAI_NYUUKABI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}