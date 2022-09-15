package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002YUUZAAKENGENBUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002YUUZAAKENGENBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002YUUZAAKENGENBUMONMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002YUUZAAKENGENBUMONDao
 * @version

 */public class A002YUUZAAKENGENBUMONDaoTest extends BaseTest {


	@Autowired
	private A002YUUZAAKENGENBUMONDao A002YUUZAAKENGENBUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A002YUUZAAKENGENdrp () throws Exception {


		List<A002YUUZAAKENGENBUMONEntity> returnVal = A002YUUZAAKENGENBUMONDao.A002YUUZAAKENGENdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}