package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7insertBUHINSYOUSAIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7insertBUHINSYOUSAIRINJIHYOUMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A013T7insertBUHINSYOUSAIRINJIHYOUDao
 * @version

 */public class A013T7insertBUHINSYOUSAIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A013T7insertBUHINSYOUSAIRINJIHYOUDao A013T7insertBUHINSYOUSAIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013T7insertBUHINSYOUSAIRINJIHYOU () throws Exception {
		String KYAKUSAKIMEISHOU = "1";
		String ASENBURIRAIN = "1";
		String KIKAIMEISHOU = "1";
		String BUHINMEISHOU = "1";
		String HINBANNO1 = "1";
		int SEISAKUSUU = 0;
		String SHANAIKOUJIBANGOU = "1";
		String TANTOUSHA = "1";
		String MAISUU = "1";
		String HIDZUKE = "1";
		String HINMEI = "1";
		int KOSUU = 0;
		int SOUKOSUU = 0;
		String ZAISHITSU_KEISHIKI = "1";
		String SEISAKUSHA = "1";
		String TOUROKUSHAID = "1";
		String SEISAKUHINKUBUN = "1";
		String DOUNYUUBANGOU = "1";
		String KIBOUNOUKI = "1";
		String HINBANNO = "1";


		int returnVal = A013T7insertBUHINSYOUSAIRINJIHYOUDao.A013T7insertBUHINSYOUSAIRINJIHYOU(KYAKUSAKIMEISHOU, ASENBURIRAIN, KIKAIMEISHOU, BUHINMEISHOU, HINBANNO1, SEISAKUSUU, SHANAIKOUJIBANGOU, TANTOUSHA, MAISUU, HIDZUKE, HINMEI, KOSUU, SOUKOSUU, ZAISHITSU_KEISHIKI, SEISAKUSHA, TOUROKUSHAID, SEISAKUHINKUBUN, DOUNYUUBANGOU, KIBOUNOUKI, HINBANNO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}