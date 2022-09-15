package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateSYOUHINDao
 * @version

 */public class A011W41ClickupdateSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A011W41ClickupdateSYOUHINDao A011W41ClickupdateSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011W41ClickupdateSYOUHIN () throws Exception {
		int SYOUHIN_ZAIKOSUURYOU = 0;
		String ay1_ZAIKOU_SHOUHINNO = "1";


		int returnVal = A011W41ClickupdateSYOUHINDao.A011W41ClickupdateSYOUHIN(SYOUHIN_ZAIKOSUURYOU, ay1_ZAIKOU_SHOUHINNO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}