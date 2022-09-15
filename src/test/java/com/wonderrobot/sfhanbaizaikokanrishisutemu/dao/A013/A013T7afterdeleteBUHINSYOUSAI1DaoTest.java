package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterdeleteBUHINSYOUSAI1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterdeleteBUHINSYOUSAI1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterdeleteBUHINSYOUSAI1Dao
 * @version

 */public class A013T7afterdeleteBUHINSYOUSAI1DaoTest extends BaseTest {


	@Autowired
	private A013T7afterdeleteBUHINSYOUSAI1Dao A013T7afterdeleteBUHINSYOUSAI1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterdeleteBUHINSYOUSAI1 () throws Exception {
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String KUUHAKUNODEETAWOSAKUJOSURU = "1";


		int returnVal = A013T7afterdeleteBUHINSYOUSAI1Dao.A013T7afterdeleteBUHINSYOUSAI1(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KUUHAKUNODEETAWOSAKUJOSURU);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}