package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1updateNYUKINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1updateNYUKINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1updateNYUKINDao
 * @version

 */public class A011PageAfterSave1updateNYUKINDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1updateNYUKINDao A011PageAfterSave1updateNYUKINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1updateNYUKIN () throws Exception {
		double JPYGOUKEI = 0.0;
		String CHUUBUNSHONO1 = "1";


		int returnVal = A011PageAfterSave1updateNYUKINDao.A011PageAfterSave1updateNYUKIN(JPYGOUKEI, CHUUBUNSHONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}