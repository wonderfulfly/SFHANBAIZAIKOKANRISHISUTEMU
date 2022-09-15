package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003BUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003BUMONMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003BUMONDao
 * @version

 */public class A003BUMONDaoTest extends BaseTest {


	@Autowired
	private A003BUMONDao A003BUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A003InitDepthZero () throws Exception {
		String BUMONID1 = "1";


		List<A003BUMONEntity> returnVal = A003BUMONDao.A003InitDepthZero(BUMONID1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}