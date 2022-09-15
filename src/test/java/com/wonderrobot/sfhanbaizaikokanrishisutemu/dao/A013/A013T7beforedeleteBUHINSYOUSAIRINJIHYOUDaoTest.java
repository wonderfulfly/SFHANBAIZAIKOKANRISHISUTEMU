package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7beforedeleteBUHINSYOUSAIRINJIHYOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao
 * @version

 */public class A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7beforedeleteBUHINSYOUSAIRINJIHYOU () throws Exception {
		String ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU = "1";


		int returnVal = A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao.A013T7beforedeleteBUHINSYOUSAIRINJIHYOU(ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}