package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003InsertSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003InsertSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003InsertSaveDao
 * @version

 */public class A003InsertSaveDaoTest extends BaseTest {


	@Autowired
	private A003InsertSaveDao A003InsertSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A003InsertSaveData () throws Exception {
		String BUMONID = "1";
		String BUMONMEI = "1";


		int returnVal = A003InsertSaveDao.A003InsertSaveData(BUMONID, BUMONMEI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}