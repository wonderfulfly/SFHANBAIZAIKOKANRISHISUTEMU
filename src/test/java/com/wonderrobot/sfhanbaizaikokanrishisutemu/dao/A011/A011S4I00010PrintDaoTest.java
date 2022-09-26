package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011S4I00010PrintDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011S4I00010PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011S4I00010PrintMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A011S4I00010PrintDao
 * @version

 */public class A011S4I00010PrintDaoTest extends BaseTest {


	@Autowired
	private A011S4I00010PrintDao A011S4I00010PrintDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011S4I00010Print () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011S4I00010PrintEntity> returnVal = A011S4I00010PrintDao.A011S4I00010Print(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}