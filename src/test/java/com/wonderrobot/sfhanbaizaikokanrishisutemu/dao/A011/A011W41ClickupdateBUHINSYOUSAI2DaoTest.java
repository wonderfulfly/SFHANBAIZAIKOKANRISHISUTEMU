package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateBUHINSYOUSAI2Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateBUHINSYOUSAI2Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateBUHINSYOUSAI2Dao
 * @version

 */public class A011W41ClickupdateBUHINSYOUSAI2DaoTest extends BaseTest {


	@Autowired
	private A011W41ClickupdateBUHINSYOUSAI2Dao A011W41ClickupdateBUHINSYOUSAI2Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011W41ClickupdateBUHINSYOUSAI2 () throws Exception {
		String CHUUBUNSHONO1 = "1";


		int returnVal = A011W41ClickupdateBUHINSYOUSAI2Dao.A011W41ClickupdateBUHINSYOUSAI2(CHUUBUNSHONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}