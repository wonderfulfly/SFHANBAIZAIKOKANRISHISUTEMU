package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickupdateSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickupdateSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickupdateSYOUHINDao
 * @version

 */public class A007grdB8AE81ClickupdateSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A007grdB8AE81ClickupdateSYOUHINDao A007grdB8AE81ClickupdateSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007grdB8AE81ClickupdateSYOUHIN () throws Exception {
		int ay3_SYOUHIN_ZAIKOSUURYOU = 0;
		String SHOUHINNO = "1";


		int returnVal = A007grdB8AE81ClickupdateSYOUHINDao.A007grdB8AE81ClickupdateSYOUHIN(ay3_SYOUHIN_ZAIKOSUURYOU, SHOUHINNO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}