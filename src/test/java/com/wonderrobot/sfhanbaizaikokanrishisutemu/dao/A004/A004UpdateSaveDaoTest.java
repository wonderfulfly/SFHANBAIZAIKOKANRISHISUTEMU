package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004UpdateSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004UpdateSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004UpdateSaveDao
 * @version

 */public class A004UpdateSaveDaoTest extends BaseTest {


	@Autowired
	private A004UpdateSaveDao A004UpdateSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A004UpdateSaveData () throws Exception {
		String KAISHAID = "1";
		String KAISHAMEI = "1";
		String KAISHARYAKUSHOU = "1";
		String ADORESU = "1";
		String RENRAKUSAKI = "1";
		String SHIHARAIKIGEN = "1";
		String KAISHAKUBUN = "1";
		String KAISHAID1 = "1";


		int returnVal = A004UpdateSaveDao.A004UpdateSaveData(KAISHAID, KAISHAMEI, KAISHARYAKUSHOU, ADORESU, RENRAKUSAKI, SHIHARAIKIGEN, KAISHAKUBUN, KAISHAID1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}