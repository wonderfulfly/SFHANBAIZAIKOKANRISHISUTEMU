package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterdeleteMITUMORIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterdeleteMITUMORIRINJIHYOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterdeleteMITUMORIRINJIHYOUDao
 * @version

 */public class A010W6afterdeleteMITUMORIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A010W6afterdeleteMITUMORIRINJIHYOUDao A010W6afterdeleteMITUMORIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterdeleteMITUMORIRINJIHYOU () throws Exception {
		String ROGUINIDNODEETAWOSAKUJOSURU = "1";


		int returnVal = A010W6afterdeleteMITUMORIRINJIHYOUDao.A010W6afterdeleteMITUMORIRINJIHYOU(ROGUINIDNODEETAWOSAKUJOSURU);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}