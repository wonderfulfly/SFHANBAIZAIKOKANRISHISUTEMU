package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickupdateBUHINSYOUSAI1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao
 * @version

 */public class A013grdB16AC161ClickupdateBUHINSYOUSAI1DaoTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013grdB16AC161ClickupdateBUHINSYOUSAI1 () throws Exception {
		String SEISAKUHINKUBUN = "1";
		String HINMEI = "1";
		String HINBANNO1 = "1";
		int KOSUU = 0;
		int SOUKOSUU = 0;
		String TSUKAMATSUNYUUSAKI = "1";
		String TANTOU = "1";
		String TEHAISAKI = "1";
		double KOUNYUUTANKA1 = 0.0;
		String KAHEI = "1";
		double SHOUKEI = 0.0;
		String NYUUKABI = "1";
		String TEHAIBI = "1";
		String KIBOUNOUKI = "1";
		String ay4_BUHINSYOUSAI_CHUUBUNSHONO = "1";
		String CHUUBUNSHOMEISAINO1 = "1";
		String KOUJIKANRIBANGOU1 = "1";
		String HINBANNO = "1";


		int returnVal = A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao.A013grdB16AC161ClickupdateBUHINSYOUSAI1(SEISAKUHINKUBUN, HINMEI, HINBANNO1, KOSUU, SOUKOSUU, TSUKAMATSUNYUUSAKI, TANTOU, TEHAISAKI, KOUNYUUTANKA1, KAHEI, SHOUKEI, NYUUKABI, TEHAIBI, KIBOUNOUKI, ay4_BUHINSYOUSAI_CHUUBUNSHONO, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}