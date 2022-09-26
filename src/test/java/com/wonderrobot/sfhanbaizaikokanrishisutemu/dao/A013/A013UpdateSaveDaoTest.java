package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013UpdateSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013UpdateSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013UpdateSaveDao
 * @version

 */public class A013UpdateSaveDaoTest extends BaseTest {


	@Autowired
	private A013UpdateSaveDao A013UpdateSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013UpdateSaveData () throws Exception {
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
		String CHUUBUNSHONO1 = "1";
		String CHUUBUNSHOMEISAINO1 = "1";
		String KOUJIKANRIBANGOU1 = "1";


		int returnVal = A013UpdateSaveDao.A013UpdateSaveData(TOKUISAKI, MAISUU, ASENBURIRAIN, KAKUTEIKUBUN, KIKAIMEISHOU, BUHINMEISHOU, CHUUBUNSHONO, SEISAKUSUU, TANTOUSHA, KOUJIKANRIBANGOU, SHUKKANO, JPYGOUKEIKINGAKU, RMBGOUKEIKINGAKU, USDGOUKEIKINGAKU, CHUUBUNSHOMEISAINO, CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}