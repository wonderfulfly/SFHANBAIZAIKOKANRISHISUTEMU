package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickupdateBUHINSYOUSAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickupdateBUHINSYOUSAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickupdateBUHINSYOUSAIDao
 * @version

 */public class A013grdB16AC161ClickupdateBUHINSYOUSAIDaoTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickupdateBUHINSYOUSAIDao A013grdB16AC161ClickupdateBUHINSYOUSAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013grdB16AC161ClickupdateBUHINSYOUSAI () throws Exception {
		String CHUUBUNSHONO1 = "1";
		String CHUUBUNSHOMEISAINO1 = "1";
		String KOUJIKANRIBANGOU1 = "1";
		String HINBANNO = "1";


		int returnVal = A013grdB16AC161ClickupdateBUHINSYOUSAIDao.A013grdB16AC161ClickupdateBUHINSYOUSAI(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}