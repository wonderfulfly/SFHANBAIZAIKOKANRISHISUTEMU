package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIDao
 * @version

 */public class A013T7afterselectBUHINSYOUSAIDaoTest extends BaseTest {


	@Autowired
	private A013T7afterselectBUHINSYOUSAIDao A013T7afterselectBUHINSYOUSAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterselectBUHINSYOUSAI () throws Exception {
		String ay9_BUHINSYOUSAIRINJIHYOU_HINMEI = "1";


		List<Double> returnVal = A013T7afterselectBUHINSYOUSAIDao.A013T7afterselectBUHINSYOUSAI(ay9_BUHINSYOUSAIRINJIHYOU_HINMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}