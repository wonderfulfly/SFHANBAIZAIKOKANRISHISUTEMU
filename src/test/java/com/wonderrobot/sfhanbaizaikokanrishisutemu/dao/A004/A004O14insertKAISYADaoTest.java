package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004O14insertKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004O14insertKAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A004O14insertKAISYADao
 * @version

 */public class A004O14insertKAISYADaoTest extends BaseTest {


	@Autowired
	private A004O14insertKAISYADao A004O14insertKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A004O14insertKAISYA () throws Exception {
		String KAISHAMEI = "1";
		String KAISHARYAKUSHOU = "1";
		String ADORESU = "1";
		String RENRAKUSAKI = "1";
		int SHIHARAIKIGEN = 0;
		String KAISHAKUBUN = "1";
		String KAISHAID = "1";


		int returnVal = A004O14insertKAISYADao.A004O14insertKAISYA(KAISHAMEI, KAISHARYAKUSHOU, ADORESU, RENRAKUSAKI, SHIHARAIKIGEN, KAISHAKUBUN, KAISHAID);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}