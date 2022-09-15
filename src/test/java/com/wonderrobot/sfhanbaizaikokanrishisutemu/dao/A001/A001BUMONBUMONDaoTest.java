package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001BUMONBUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001BUMONBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001BUMONBUMONMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001BUMONBUMONDao
 * @version

 */public class A001BUMONBUMONDaoTest extends BaseTest {


	@Autowired
	private A001BUMONBUMONDao A001BUMONBUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A001BUMONdrp () throws Exception {


		List<A001BUMONBUMONEntity> returnVal = A001BUMONBUMONDao.A001BUMONdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}