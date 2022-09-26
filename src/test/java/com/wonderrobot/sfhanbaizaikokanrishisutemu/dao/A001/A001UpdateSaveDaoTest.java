package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001UpdateSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001UpdateSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001UpdateSaveDao
 * @version

 */public class A001UpdateSaveDaoTest extends BaseTest {


	@Autowired
	private A001UpdateSaveDao A001UpdateSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A001UpdateSaveData () throws Exception {
		String SHAINID = "1";
		String SHAINMEI = "1";
		String DENWABANGOU = "1";
		String KEITAIBANGOU = "1";
		String EMAIL = "1";
		String LINE = "1";
		String YUUZAAKENGEN = "1";
		String YUUKOUKUBUN = "1";
		String ROGUINID = "1";
		String PASUWAADO = "1";
		String SHAINID1 = "1";
		String ROGUINID1 = "1";


		int returnVal = A001UpdateSaveDao.A001UpdateSaveData(SHAINID, SHAINMEI, DENWABANGOU, KEITAIBANGOU, EMAIL, LINE, YUUZAAKENGEN, YUUKOUKUBUN, ROGUINID, PASUWAADO, SHAINID1, ROGUINID1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}