package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011InsertSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011InsertSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011InsertSaveDao
 * @version

 */public class A011InsertSaveDaoTest extends BaseTest {


	@Autowired
	private A011InsertSaveDao A011InsertSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011InsertSaveData () throws Exception {
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


		int returnVal = A011InsertSaveDao.A011InsertSaveData(SHUTSUNYUUKOFURAGU, CHUUMONHIDZUKE, CHUUBUNSHONO, SHUKKANO, MITSUMORISHONO, KYAKUSAKIID, KYAKUSAKITANTOU, ADORESU, DENWABANGOU, RESHIITONO, SHANAIKOUJIBANGOU, HINMEI, TANTOUSHAID, KEIYAKUSAKI, NOUKIYOTEIBI, NOUNYUUBI, SHOUHINSOUGAKUJPY, SHOUHINSOUGAKURMB, SHOUHINSOUGAKUUSD);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}