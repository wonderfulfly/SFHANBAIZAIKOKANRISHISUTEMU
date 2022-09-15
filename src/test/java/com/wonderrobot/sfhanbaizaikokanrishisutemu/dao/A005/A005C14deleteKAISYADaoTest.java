package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C14deleteKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C14deleteKAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A005C14deleteKAISYADao
 * @version

 */public class A005C14deleteKAISYADaoTest extends BaseTest {


	@Autowired
	private A005C14deleteKAISYADao A005C14deleteKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A005C14deleteKAISYA () throws Exception {


		int returnVal = A005C14deleteKAISYADao.A005C14deleteKAISYA();
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}