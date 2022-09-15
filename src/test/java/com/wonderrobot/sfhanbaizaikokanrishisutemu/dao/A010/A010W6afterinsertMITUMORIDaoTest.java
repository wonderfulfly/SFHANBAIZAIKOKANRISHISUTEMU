package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertMITUMORIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertMITUMORIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertMITUMORIDao
 * @version

 */public class A010W6afterinsertMITUMORIDaoTest extends BaseTest {


	@Autowired
	private A010W6afterinsertMITUMORIDao A010W6afterinsertMITUMORIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterinsertMITUMORI () throws Exception {
		String MITUMORIRINJIHYOU_MITSUMORINO = "1";
		String MITUMORIRINJIHYOU_HIDZUKE = "1";
		String MITUMORIRINJIHYOU_KYAKUSAKI = "1";
		String MITUMORIRINJIHYOU_SAKUSEISHA = "1";
		String MITUMORIRINJIHYOU_HINMEI = "1";
		double MITUMORIRINJIHYOU_GOUKEI = 0.0;


		int returnVal = A010W6afterinsertMITUMORIDao.A010W6afterinsertMITUMORI(MITUMORIRINJIHYOU_MITSUMORINO, MITUMORIRINJIHYOU_HIDZUKE, MITUMORIRINJIHYOU_KYAKUSAKI, MITUMORIRINJIHYOU_SAKUSEISHA, MITUMORIRINJIHYOU_HINMEI, MITUMORIRINJIHYOU_GOUKEI);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}