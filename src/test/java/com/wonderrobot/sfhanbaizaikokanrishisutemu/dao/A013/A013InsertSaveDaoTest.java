package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013InsertSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013InsertSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013InsertSaveDao
 * @version

 */public class A013InsertSaveDaoTest extends BaseTest {


	@Autowired
	private A013InsertSaveDao A013InsertSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013InsertSaveData () throws Exception {
		String TOKUISAKI = "1";
		String MAISUU = "1";
		String ASENBURIRAIN = "1";
		String KAKUTEIKUBUN = "1";
		String KIKAIMEISHOU = "1";
		String BUHINMEISHOU = "1";
		String CHUUBUNSHONO = "1";
		String SEISAKUSUU = "1";
		String TANTOUSHA = "1";
		String KOUJIKANRIBANGOU = "1";
		String SHUKKANO = "1";
		String JPYGOUKEIKINGAKU = "1";
		String RMBGOUKEIKINGAKU = "1";
		String USDGOUKEIKINGAKU = "1";
		String CHUUBUNSHOMEISAINO = "1";


		int returnVal = A013InsertSaveDao.A013InsertSaveData(TOKUISAKI, MAISUU, ASENBURIRAIN, KAKUTEIKUBUN, KIKAIMEISHOU, BUHINMEISHOU, CHUUBUNSHONO, SEISAKUSUU, TANTOUSHA, KOUJIKANRIBANGOU, SHUKKANO, JPYGOUKEIKINGAKU, RMBGOUKEIKINGAKU, USDGOUKEIKINGAKU, CHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}