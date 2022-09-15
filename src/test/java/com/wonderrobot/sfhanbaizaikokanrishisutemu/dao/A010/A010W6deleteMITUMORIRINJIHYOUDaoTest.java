package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6deleteMITUMORIRINJIHYOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6deleteMITUMORIRINJIHYOUMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A010W6deleteMITUMORIRINJIHYOUDao
 * @version

 */public class A010W6deleteMITUMORIRINJIHYOUDaoTest extends BaseTest {


	@Autowired
	private A010W6deleteMITUMORIRINJIHYOUDao A010W6deleteMITUMORIRINJIHYOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6deleteMITUMORIRINJIHYOU () throws Exception {


		int returnVal = A010W6deleteMITUMORIRINJIHYOUDao.A010W6deleteMITUMORIRINJIHYOU();
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}