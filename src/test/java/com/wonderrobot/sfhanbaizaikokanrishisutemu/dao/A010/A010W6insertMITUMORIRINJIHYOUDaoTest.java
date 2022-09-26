package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6insertMITUMORIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6insertMITUMORIRINJIHYOUMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A010W6insertMITUMORIRINJIHYOUDao
 * @version

 */public class A010W6insertMITUMORIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A010W6insertMITUMORIRINJIHYOUDao A010W6insertMITUMORIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6insertMITUMORIRINJIHYOU () throws Exception {
		String HIDZUKE = "1";
		String KYAKUSAKI = "1";
		String KYAKUSAKITANTOU = "1";
		String MITSUMORINO = "1";
		String SAKUSEISHA = "1";
		String HINMEI = "1";
		double BANGOU = 0.0;
		String KOUMOKU = "1";
		int SUURYOU = 0;
		double PRICE = 0.0;
		double GOLD = 0.0;
		String KAHEI = "1";
		String KIROKUSHAID = "1";


		int returnVal = A010W6insertMITUMORIRINJIHYOUDao.A010W6insertMITUMORIRINJIHYOU(HIDZUKE, KYAKUSAKI, KYAKUSAKITANTOU, MITSUMORINO, SAKUSEISHA, HINMEI, BANGOU, KOUMOKU, SUURYOU, PRICE, GOLD, KAHEI, KIROKUSHAID);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}