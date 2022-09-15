package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009NYUKINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009NYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009NYUKINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009NYUKINDao
 * @version

 */public class A009NYUKINDaoTest extends BaseTest {


	@Autowired
	private A009NYUKINDao A009NYUKINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009InitDepthZero () throws Exception {
		String RYOUSHUUSHONO = "1";


		List<A009NYUKINEntity> returnVal = A009NYUKINDao.A009InitDepthZero(RYOUSHUUSHONO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}