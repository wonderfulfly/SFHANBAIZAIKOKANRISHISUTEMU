package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao
 * @version

 */public class A013T7afterselectBUHINSYOUSAIRINJIHYOU1DaoTest extends BaseTest {


	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterselectBUHINSYOUSAIRINJIHYOU1 () throws Exception {
		String NOROGUINIDTOITCHISURU = "1";


		List<A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity> returnVal = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao.A013T7afterselectBUHINSYOUSAIRINJIHYOU1(NOROGUINIDTOITCHISURU);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}