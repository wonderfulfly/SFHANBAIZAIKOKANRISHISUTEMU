package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectSYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectSYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectSYAINDao
 * @version

 */public class A013T7afterselectSYAINDaoTest extends BaseTest {


	@Autowired
	private A013T7afterselectSYAINDao A013T7afterselectSYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterselectSYAIN () throws Exception {
		String ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA = "1";


		List<A013T7afterselectSYAINEntity> returnVal = A013T7afterselectSYAINDao.A013T7afterselectSYAIN(ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}