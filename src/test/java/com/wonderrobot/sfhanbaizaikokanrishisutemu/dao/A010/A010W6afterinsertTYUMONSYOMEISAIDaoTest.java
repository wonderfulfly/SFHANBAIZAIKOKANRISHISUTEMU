package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertTYUMONSYOMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertTYUMONSYOMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertTYUMONSYOMEISAIDao
 * @version

 */public class A010W6afterinsertTYUMONSYOMEISAIDaoTest extends BaseTest {


	@Autowired
	private A010W6afterinsertTYUMONSYOMEISAIDao A010W6afterinsertTYUMONSYOMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterinsertTYUMONSYOMEISAI () throws Exception {
		String CHUUBUNSHONOautoNum = "1";
		String CHUUBUNSHOMEISAINOautoNum = "1";
		String MITUMORIRINJIHYOU_KOUMOKU = "1";
		int MITUMORIRINJIHYOU_SUURYOU = 0;
		double MITUMORIRINJIHYOU_PRICE = 0.0;
		double MITUMORIRINJIHYOU_GOLD = 0.0;
		String MITUMORIRINJIHYOU_KAHEI = "1";


		int returnVal = A010W6afterinsertTYUMONSYOMEISAIDao.A010W6afterinsertTYUMONSYOMEISAI(CHUUBUNSHONOautoNum, CHUUBUNSHOMEISAINOautoNum, MITUMORIRINJIHYOU_KOUMOKU, MITUMORIRINJIHYOU_SUURYOU, MITUMORIRINJIHYOU_PRICE, MITUMORIRINJIHYOU_GOLD, MITUMORIRINJIHYOU_KAHEI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}