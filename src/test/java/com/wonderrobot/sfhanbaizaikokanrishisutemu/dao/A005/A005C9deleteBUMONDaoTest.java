package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C9deleteBUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C9deleteBUMONMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A005C9deleteBUMONDao
 * @version

 */public class A005C9deleteBUMONDaoTest extends BaseTest {


	@Autowired
	private A005C9deleteBUMONDao A005C9deleteBUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A005C9deleteBUMON () throws Exception {


		int returnVal = A005C9deleteBUMONDao.A005C9deleteBUMON();
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}