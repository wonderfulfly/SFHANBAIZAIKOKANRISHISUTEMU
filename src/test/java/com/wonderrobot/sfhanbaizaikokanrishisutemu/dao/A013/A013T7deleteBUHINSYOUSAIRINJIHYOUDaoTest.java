package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7deleteBUHINSYOUSAIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7deleteBUHINSYOUSAIRINJIHYOUMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A013T7deleteBUHINSYOUSAIRINJIHYOUDao
 * @version

 */public class A013T7deleteBUHINSYOUSAIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A013T7deleteBUHINSYOUSAIRINJIHYOUDao A013T7deleteBUHINSYOUSAIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7deleteBUHINSYOUSAIRINJIHYOU () throws Exception {


		int returnVal = A013T7deleteBUHINSYOUSAIRINJIHYOUDao.A013T7deleteBUHINSYOUSAIRINJIHYOU();
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}