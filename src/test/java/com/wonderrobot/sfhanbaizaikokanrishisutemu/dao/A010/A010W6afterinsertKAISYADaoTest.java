package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertKAISYADao
 * @version

 */public class A010W6afterinsertKAISYADaoTest extends BaseTest {


	@Autowired
	private A010W6afterinsertKAISYADao A010W6afterinsertKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterinsertKAISYA () throws Exception {
		String KAISHAIDautoNum = "1";
		String MITUMORIRINJIHYOU_KYAKUSAKI = "1";


		int returnVal = A010W6afterinsertKAISYADao.A010W6afterinsertKAISYA(KAISHAIDautoNum, MITUMORIRINJIHYOU_KYAKUSAKI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}