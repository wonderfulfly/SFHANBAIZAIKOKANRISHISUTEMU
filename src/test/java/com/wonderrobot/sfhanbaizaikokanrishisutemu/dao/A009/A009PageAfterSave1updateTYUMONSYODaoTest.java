package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009PageAfterSave1updateTYUMONSYODao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009PageAfterSave1updateTYUMONSYOMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterSave1updateTYUMONSYODao
 * @version

 */public class A009PageAfterSave1updateTYUMONSYODaoTest extends BaseTest {


	@Autowired
	private A009PageAfterSave1updateTYUMONSYODao A009PageAfterSave1updateTYUMONSYODao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009PageAfterSave1updateTYUMONSYO () throws Exception {
		String ay1_NYUKIN_RESHIITONO = "1";
		String CHUUBUNSHONO1 = "1";


		int returnVal = A009PageAfterSave1updateTYUMONSYODao.A009PageAfterSave1updateTYUMONSYO(ay1_NYUKIN_RESHIITONO, CHUUBUNSHONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}