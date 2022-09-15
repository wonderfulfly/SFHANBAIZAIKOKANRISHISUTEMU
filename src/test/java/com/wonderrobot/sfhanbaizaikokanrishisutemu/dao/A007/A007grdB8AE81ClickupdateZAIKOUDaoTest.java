package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickupdateZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickupdateZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickupdateZAIKOUDao
 * @version

 */public class A007grdB8AE81ClickupdateZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A007grdB8AE81ClickupdateZAIKOUDao A007grdB8AE81ClickupdateZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007grdB8AE81ClickupdateZAIKOU () throws Exception {
		String ZAIKONO1 = "1";


		int returnVal = A007grdB8AE81ClickupdateZAIKOUDao.A007grdB8AE81ClickupdateZAIKOU(ZAIKONO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}