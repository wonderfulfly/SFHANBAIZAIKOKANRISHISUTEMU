package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHINSYOUSAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickupdateBUHINSYOUSAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickupdateBUHINSYOUSAIDao
 * @version

 */public class A013T101ClickupdateBUHINSYOUSAIDaoTest extends BaseTest {


	@Autowired
	private A013T101ClickupdateBUHINSYOUSAIDao A013T101ClickupdateBUHINSYOUSAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T101ClickupdateBUHINSYOUSAI () throws Exception {
		String SEISAKUHINKUBUN = "1";
		String HINMEI = "1";
		String HINBANNO1 = "1";
		int KOSUU1 = 0;
		int SOUKOSUU1 = 0;
		String TSUKAMATSUNYUUSAKI = "1";
		String TANTOU = "1";
		String TEHAISAKI = "1";
		double KOUNYUUTANKA1 = 0.0;
		String KAHEI = "1";
		double SHOUKEI1 = 0.0;
		String NYUUKABI = "1";
		String TEHAIBI = "1";
		String KIBOUNOUKI = "1";
		String CHUUBUNSHONO1 = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String KOUJIKANRIBANGOU1 = "1";
		String HINBANNO = "1";


		int returnVal = A013T101ClickupdateBUHINSYOUSAIDao.A013T101ClickupdateBUHINSYOUSAI(SEISAKUHINKUBUN, HINMEI, HINBANNO1, KOSUU1, SOUKOSUU1, TSUKAMATSUNYUUSAKI, TANTOU, TEHAISAKI, KOUNYUUTANKA1, KAHEI, SHOUKEI1, NYUUKABI, TEHAIBI, KIBOUNOUKI, CHUUBUNSHONO1, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1, HINBANNO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}