package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004InsertSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004InsertSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004InsertSaveDao
 * @version

 */public class A004InsertSaveDaoTest extends BaseTest {


	@Autowired
	private A004InsertSaveDao A004InsertSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A004InsertSaveData () throws Exception {
		String KAISHAID = "1";
		String KAISHAMEI = "1";
		String KAISHARYAKUSHOU = "1";
		String ADORESU = "1";
		String RENRAKUSAKI = "1";
		String SHIHARAIKIGEN = "1";
		String KAISHAKUBUN = "1";


		int returnVal = A004InsertSaveDao.A004InsertSaveData(KAISHAID, KAISHAMEI, KAISHARYAKUSHOU, ADORESU, RENRAKUSAKI, SHIHARAIKIGEN, KAISHAKUBUN);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}