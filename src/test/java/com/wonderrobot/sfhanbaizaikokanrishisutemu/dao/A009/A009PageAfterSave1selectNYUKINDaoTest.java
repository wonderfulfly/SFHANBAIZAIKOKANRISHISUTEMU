package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009PageAfterSave1selectNYUKINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterSave1selectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009PageAfterSave1selectNYUKINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterSave1selectNYUKINDao
 * @version

 */public class A009PageAfterSave1selectNYUKINDaoTest extends BaseTest {


	@Autowired
	private A009PageAfterSave1selectNYUKINDao A009PageAfterSave1selectNYUKINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009PageAfterSave1selectNYUKIN () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A009PageAfterSave1selectNYUKINEntity> returnVal = A009PageAfterSave1selectNYUKINDao.A009PageAfterSave1selectNYUKIN(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}