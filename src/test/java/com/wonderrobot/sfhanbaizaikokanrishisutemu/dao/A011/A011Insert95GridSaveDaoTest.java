package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011Insert95GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011Insert95GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Insert95GridSaveDao
 * @version

 */public class A011Insert95GridSaveDaoTest extends BaseTest {


	@Autowired
	private A011Insert95GridSaveDao A011Insert95GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011Insert95GridSaveData () throws Exception {
		String KUBUN = "1";
		String KOUMOKU = "1";
		String SUURYOU = "1";
		String HANBAITANKA = "1";
		String KAHEI = "1";
		String HANBAIKINGAKU = "1";
		String TSUKAMATSUNYUUKINGAKUJPY = "1";
		String TSUKAMATSUNYUUKINGAKURMB = "1";
		String TSUKAMATSUNYUUKINGAKUUSD = "1";
		String SHUKKOFURAGU = "1";
		String CHUUBUNSHONO = "1";
		String CHUUBUNSHOMEISAINO = "1";


		int returnVal = A011Insert95GridSaveDao.A011Insert95GridSaveData(KUBUN, KOUMOKU, SUURYOU, HANBAITANKA, KAHEI, HANBAIKINGAKU, TSUKAMATSUNYUUKINGAKUJPY, TSUKAMATSUNYUUKINGAKURMB, TSUKAMATSUNYUUKINGAKUUSD, SHUKKOFURAGU, CHUUBUNSHONO, CHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}