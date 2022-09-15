package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C14insertKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C14insertKAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A005C14insertKAISYADao
 * @version

 */public class A005C14insertKAISYADaoTest extends BaseTest {


	@Autowired
	private A005C14insertKAISYADao A005C14insertKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A005C14insertKAISYA () throws Exception {
		String KAISHAID = "1";
		String KAISHAMEI = "1";
		String KAISHARYAKUSHOU = "1";
		String ADORESU = "1";
		String RENRAKUSAKI = "1";
		int SHIHARAIKIGEN = 0;
		String KAISHAKUBUN = "1";


		int returnVal = A005C14insertKAISYADao.A005C14insertKAISYA(KAISHAID, KAISHAMEI, KAISHARYAKUSHOU, ADORESU, RENRAKUSAKI, SHIHARAIKIGEN, KAISHAKUBUN);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}