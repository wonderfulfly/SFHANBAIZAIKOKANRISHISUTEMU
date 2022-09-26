package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009InsertSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009InsertSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009InsertSaveDao
 * @version

 */public class A009InsertSaveDaoTest extends BaseTest {


	@Autowired
	private A009InsertSaveDao A009InsertSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009InsertSaveData () throws Exception {
		String KYAKUSAKIID = "1";
		String TANTOUSHAID = "1";
		String RESHIITONO = "1";
		String CHUUBUNSHONO = "1";
		String KANTOKU = "1";
		String CHUUMONHIDZUKE = "1";
		String NYUUKINKINGAKU = "1";
		String JISSAINYUUKINJOUTAI = "1";


		int returnVal = A009InsertSaveDao.A009InsertSaveData(KYAKUSAKIID, TANTOUSHAID, RESHIITONO, CHUUBUNSHONO, KANTOKU, CHUUMONHIDZUKE, NYUUKINKINGAKU, JISSAINYUUKINJOUTAI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}