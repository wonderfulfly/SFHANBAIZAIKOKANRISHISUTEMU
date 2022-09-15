package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterupdateBUHINSYOUSAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterupdateBUHINSYOUSAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterupdateBUHINSYOUSAIDao
 * @version

 */public class A013T7afterupdateBUHINSYOUSAIDaoTest extends BaseTest {


	@Autowired
	private A013T7afterupdateBUHINSYOUSAIDao A013T7afterupdateBUHINSYOUSAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7afterupdateBUHINSYOUSAI () throws Exception {
		double KOUNYUUTANKA_SUM = 0.0;
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String KOUJIKANRIBANGOU = "1";
		String ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO = "1";


		int returnVal = A013T7afterupdateBUHINSYOUSAIDao.A013T7afterupdateBUHINSYOUSAI(KOUNYUUTANKA_SUM, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU, ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}