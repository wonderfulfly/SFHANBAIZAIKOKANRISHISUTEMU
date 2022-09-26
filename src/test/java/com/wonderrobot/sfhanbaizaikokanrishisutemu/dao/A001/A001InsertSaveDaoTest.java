package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001InsertSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001InsertSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001InsertSaveDao
 * @version

 */public class A001InsertSaveDaoTest extends BaseTest {


	@Autowired
	private A001InsertSaveDao A001InsertSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A001InsertSaveData () throws Exception {
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


		int returnVal = A001InsertSaveDao.A001InsertSaveData(SHAINID, SHAINMEI, DENWABANGOU, KEITAIBANGOU, EMAIL, LINE, YUUZAAKENGEN, YUUKOUKUBUN, ROGUINID, PASUWAADO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}