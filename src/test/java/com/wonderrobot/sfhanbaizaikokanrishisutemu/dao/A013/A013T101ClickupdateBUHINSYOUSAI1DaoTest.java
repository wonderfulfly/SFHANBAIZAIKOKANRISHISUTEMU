package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHINSYOUSAI1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickupdateBUHINSYOUSAI1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickupdateBUHINSYOUSAI1Dao
 * @version

 */public class A013T101ClickupdateBUHINSYOUSAI1DaoTest extends BaseTest {


	@Autowired
	private A013T101ClickupdateBUHINSYOUSAI1Dao A013T101ClickupdateBUHINSYOUSAI1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T101ClickupdateBUHINSYOUSAI1 () throws Exception {
		String CHUUBUNSHONO1 = "1";
		String CHUUBUNSHOMEISAINO1 = "1";


		int returnVal = A013T101ClickupdateBUHINSYOUSAI1Dao.A013T101ClickupdateBUHINSYOUSAI1(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}