package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004O14deleteKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004O14deleteKAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A004O14deleteKAISYADao
 * @version

 */public class A004O14deleteKAISYADaoTest extends BaseTest {


	@Autowired
	private A004O14deleteKAISYADao A004O14deleteKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A004O14deleteKAISYA () throws Exception {


		int returnVal = A004O14deleteKAISYADao.A004O14deleteKAISYA();
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}