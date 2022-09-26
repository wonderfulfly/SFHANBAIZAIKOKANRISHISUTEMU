package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008Q2I00012PrintDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008Q2I00012PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008Q2I00012PrintMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A008Q2I00012PrintDao
 * @version

 */public class A008Q2I00012PrintDaoTest extends BaseTest {


	@Autowired
	private A008Q2I00012PrintDao A008Q2I00012PrintDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A008Q2I00012Print () throws Exception {
		String KYAKUSAKI = "1";
		String CHUUMONHIDZUKE = "1";


		List<A008Q2I00012PrintEntity> returnVal = A008Q2I00012PrintDao.A008Q2I00012Print(KYAKUSAKI, CHUUMONHIDZUKE);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}