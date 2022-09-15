package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIRINJIHYOUDao
 * @version

 */public class A013T7afterselectBUHINSYOUSAIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOUDao A013T7afterselectBUHINSYOUSAIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterselectBUHINSYOUSAIRINJIHYOU () throws Exception {
		String ROGUINID = "1";


		List<A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity> returnVal = A013T7afterselectBUHINSYOUSAIRINJIHYOUDao.A013T7afterselectBUHINSYOUSAIRINJIHYOU(ROGUINID);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}