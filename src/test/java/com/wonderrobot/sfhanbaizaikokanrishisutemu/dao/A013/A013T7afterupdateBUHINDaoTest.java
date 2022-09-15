package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterupdateBUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterupdateBUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterupdateBUHINDao
 * @version

 */public class A013T7afterupdateBUHINDaoTest extends BaseTest {


	@Autowired
	private A013T7afterupdateBUHINDao A013T7afterupdateBUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterupdateBUHIN () throws Exception {
		String ay3_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_HINBAN = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU = "1";
		int ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU = 0;
		String ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_MAISUU = "1";
		String ay3_BUHINSYOUSAIRINJIHYOU_HIDZUKE = "1";
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";


		int returnVal = A013T7afterupdateBUHINDao.A013T7afterupdateBUHIN(ay3_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU, ay3_BUHINSYOUSAIRINJIHYOU_HINBAN, ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU, ay3_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN, ay3_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU, ay3_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU, ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU, ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA, ay3_BUHINSYOUSAIRINJIHYOU_MAISUU, ay3_BUHINSYOUSAIRINJIHYOU_HIDZUKE, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}