package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009UpdateSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009UpdateSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009UpdateSaveDao
 * @version

 */public class A009UpdateSaveDaoTest extends BaseTest {


	@Autowired
	private A009UpdateSaveDao A009UpdateSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009UpdateSaveData () throws Exception {
		String KYAKUSAKIID = "1";
		String TANTOUSHAID = "1";
		String RESHIITONO = "1";
		String CHUUBUNSHONO = "1";
		String KANTOKU = "1";
		String CHUUMONHIDZUKE = "1";
		String NYUUKINKINGAKU = "1";
		String JISSAINYUUKINJOUTAI = "1";
		String RESHIITONO1 = "1";


		int returnVal = A009UpdateSaveDao.A009UpdateSaveData(KYAKUSAKIID, TANTOUSHAID, RESHIITONO, CHUUBUNSHONO, KANTOKU, CHUUMONHIDZUKE, NYUUKINKINGAKU, JISSAINYUUKINJOUTAI, RESHIITONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}