package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003UpdateSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003UpdateSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003UpdateSaveDao
 * @version

 */public class A003UpdateSaveDaoTest extends BaseTest {


	@Autowired
	private A003UpdateSaveDao A003UpdateSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A003UpdateSaveData () throws Exception {
		String BUMONID = "1";
		String BUMONMEI = "1";
		String BUMONID1 = "1";


		int returnVal = A003UpdateSaveDao.A003UpdateSaveData(BUMONID, BUMONMEI, BUMONID1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}