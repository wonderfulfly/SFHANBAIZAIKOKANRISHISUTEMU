package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011Update95GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011Update95GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Update95GridSaveDao
 * @version

 */public class A011Update95GridSaveDaoTest extends BaseTest {


	@Autowired
	private A011Update95GridSaveDao A011Update95GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011Update95GridSaveData () throws Exception {
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
		String CHUUBUNSHONO1 = "1";
		String CHUUBUNSHOMEISAINO1 = "1";


		int returnVal = A011Update95GridSaveDao.A011Update95GridSaveData(KUBUN, KOUMOKU, SUURYOU, HANBAITANKA, KAHEI, HANBAIKINGAKU, TSUKAMATSUNYUUKINGAKUJPY, TSUKAMATSUNYUUKINGAKURMB, TSUKAMATSUNYUUKINGAKUUSD, SHUKKOFURAGU, CHUUBUNSHONO, CHUUBUNSHOMEISAINO, CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}