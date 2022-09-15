package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1insertBUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1insertBUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1insertBUHINDao
 * @version

 */public class A011PageAfterSave1insertBUHINDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1insertBUHINDao A011PageAfterSave1insertBUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1insertBUHIN () throws Exception {
		String ay6_TYUMONSYO_CHUUBUNSHONO = "1";
		String ay6_TYUMONSYO_SHANAIKOUJIBANGOU = "1";
		String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO = "1";


		int returnVal = A011PageAfterSave1insertBUHINDao.A011PageAfterSave1insertBUHIN(ay6_TYUMONSYO_CHUUBUNSHONO, ay6_TYUMONSYO_SHANAIKOUJIBANGOU, ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}