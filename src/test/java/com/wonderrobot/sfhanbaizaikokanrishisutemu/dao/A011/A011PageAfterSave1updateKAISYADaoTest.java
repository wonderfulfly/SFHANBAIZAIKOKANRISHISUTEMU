package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1updateKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1updateKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1updateKAISYADao
 * @version

 */public class A011PageAfterSave1updateKAISYADaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1updateKAISYADao A011PageAfterSave1updateKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1updateKAISYA () throws Exception {
		String ADORESU1 = "1";
		String DENWABANGOU1 = "1";
		String KYAKUSAKIMEISHOU = "1";


		int returnVal = A011PageAfterSave1updateKAISYADao.A011PageAfterSave1updateKAISYA(ADORESU1, DENWABANGOU1, KYAKUSAKIMEISHOU);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}