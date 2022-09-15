package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013Update99GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013Update99GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013Update99GridSaveDao
 * @version

 */public class A013Update99GridSaveDaoTest extends BaseTest {


	@Autowired
	private A013Update99GridSaveDao A013Update99GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013Update99GridSaveData () throws Exception {
		String SEISAKUHINKUBUN = "1";
		String HINBANNO1 = "1";
		String HINMEI = "1";
		String KOSUU = "1";
		String SOUKOSUU = "1";
		String TSUKAMATSUNYUUSAKI = "1";
		String KIBOUNOUKI = "1";
		String TANTOU = "1";
		String TEHAISAKI = "1";
		String KOUNYUUTANKA = "1";
		String KAHEI = "1";
		String TEHAIBI = "1";
		String NYUUKABI = "1";
		String SHOUKEI = "1";
		String KAKOTANKA = "1";
		String CHUUBUNSHOMEISAINO = "1";
		String CHUUBUNSHONO = "1";
		String KIBOUTANKA = "1";
		String NYUUKAYOTEIBI = "1";
		String HINBANNO = "1";
		String KAKUTEIKUBUN = "1";
		String KOUJIKANRIBANGOU = "1";
		String CHUUBUNSHONO1 = "1";
		String CHUUBUNSHOMEISAINO1 = "1";
		String HINBANNO2 = "1";


		int returnVal = A013Update99GridSaveDao.A013Update99GridSaveData(SEISAKUHINKUBUN, HINBANNO1, HINMEI, KOSUU, SOUKOSUU, TSUKAMATSUNYUUSAKI, KIBOUNOUKI, TANTOU, TEHAISAKI, KOUNYUUTANKA, KAHEI, TEHAIBI, NYUUKABI, SHOUKEI, KAKOTANKA, CHUUBUNSHOMEISAINO, CHUUBUNSHONO, KIBOUTANKA, NYUUKAYOTEIBI, HINBANNO, KAKUTEIKUBUN, KOUJIKANRIBANGOU, CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1, HINBANNO2);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}