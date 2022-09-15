package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickupdateBUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickupdateBUHINDao
 * @version

 */public class A013T101ClickupdateBUHINDaoTest extends BaseTest {


	@Autowired
	private A013T101ClickupdateBUHINDao A013T101ClickupdateBUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T101ClickupdateBUHIN () throws Exception {
		String ay1_BUHINSYOUSAI_CHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";


		int returnVal = A013T101ClickupdateBUHINDao.A013T101ClickupdateBUHIN(ay1_BUHINSYOUSAI_CHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}