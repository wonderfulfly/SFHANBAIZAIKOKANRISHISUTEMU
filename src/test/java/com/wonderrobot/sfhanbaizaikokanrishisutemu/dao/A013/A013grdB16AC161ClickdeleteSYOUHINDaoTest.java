package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickdeleteSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickdeleteSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickdeleteSYOUHINDao
 * @version

 */public class A013grdB16AC161ClickdeleteSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickdeleteSYOUHINDao A013grdB16AC161ClickdeleteSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013grdB16AC161ClickdeleteSYOUHIN () throws Exception {
		String KETSUGOUMOJI2 = "1";


		int returnVal = A013grdB16AC161ClickdeleteSYOUHINDao.A013grdB16AC161ClickdeleteSYOUHIN(KETSUGOUMOJI2);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}