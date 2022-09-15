package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011UpdateSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011UpdateSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011UpdateSaveDao
 * @version

 */public class A011UpdateSaveDaoTest extends BaseTest {


	@Autowired
	private A011UpdateSaveDao A011UpdateSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011UpdateSaveData () throws Exception {
		String SHUTSUNYUUKOFURAGU = "1";
		String CHUUMONHIDZUKE = "1";
		String CHUUBUNSHONO = "1";
		String SHUKKANO = "1";
		String MITSUMORISHONO = "1";
		String KYAKUSAKIID = "1";
		String KYAKUSAKITANTOU = "1";
		String ADORESU = "1";
		String DENWABANGOU = "1";
		String RESHIITONO = "1";
		String SHANAIKOUJIBANGOU = "1";
		String HINMEI = "1";
		String TANTOUSHAID = "1";
		String KEIYAKUSAKI = "1";
		String NOUKIYOTEIBI = "1";
		String NOUNYUUBI = "1";
		String SHOUHINSOUGAKUJPY = "1";
		String SHOUHINSOUGAKURMB = "1";
		String SHOUHINSOUGAKUUSD = "1";
		String CHUUBUNSHONO1 = "1";


		int returnVal = A011UpdateSaveDao.A011UpdateSaveData(SHUTSUNYUUKOFURAGU, CHUUMONHIDZUKE, CHUUBUNSHONO, SHUKKANO, MITSUMORISHONO, KYAKUSAKIID, KYAKUSAKITANTOU, ADORESU, DENWABANGOU, RESHIITONO, SHANAIKOUJIBANGOU, HINMEI, TANTOUSHAID, KEIYAKUSAKI, NOUKIYOTEIBI, NOUNYUUBI, SHOUHINSOUGAKUJPY, SHOUHINSOUGAKURMB, SHOUHINSOUGAKUUSD, CHUUBUNSHONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}