package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickdeleteSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickdeleteSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickdeleteSYOUHINDao
 * @version

 */public class A013T101ClickdeleteSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A013T101ClickdeleteSYOUHINDao A013T101ClickdeleteSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T101ClickdeleteSYOUHIN () throws Exception {


		int returnVal = A013T101ClickdeleteSYOUHINDao.A013T101ClickdeleteSYOUHIN();
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}