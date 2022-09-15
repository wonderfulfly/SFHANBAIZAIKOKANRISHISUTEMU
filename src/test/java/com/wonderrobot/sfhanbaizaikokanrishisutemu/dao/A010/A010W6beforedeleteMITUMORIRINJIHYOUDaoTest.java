package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6beforedeleteMITUMORIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6beforedeleteMITUMORIRINJIHYOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6beforedeleteMITUMORIRINJIHYOUDao
 * @version

 */public class A010W6beforedeleteMITUMORIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A010W6beforedeleteMITUMORIRINJIHYOUDao A010W6beforedeleteMITUMORIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6beforedeleteMITUMORIRINJIHYOU () throws Exception {
		String ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU = "1";


		int returnVal = A010W6beforedeleteMITUMORIRINJIHYOUDao.A010W6beforedeleteMITUMORIRINJIHYOU(ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}