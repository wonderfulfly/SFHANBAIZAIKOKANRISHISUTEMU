package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickupdateZAIKOU1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickupdateZAIKOU1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickupdateZAIKOU1Dao
 * @version

 */public class A007grdB8AE81ClickupdateZAIKOU1DaoTest extends BaseTest {


	@Autowired
	private A007grdB8AE81ClickupdateZAIKOU1Dao A007grdB8AE81ClickupdateZAIKOU1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007grdB8AE81ClickupdateZAIKOU1 () throws Exception {
		String ZAIKONO1 = "1";


		int returnVal = A007grdB8AE81ClickupdateZAIKOU1Dao.A007grdB8AE81ClickupdateZAIKOU1(ZAIKONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}