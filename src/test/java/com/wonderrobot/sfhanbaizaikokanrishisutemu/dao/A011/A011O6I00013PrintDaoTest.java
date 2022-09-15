package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011O6I00013PrintDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011O6I00013PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011O6I00013PrintMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A011O6I00013PrintDao
 * @version

 */public class A011O6I00013PrintDaoTest extends BaseTest {


	@Autowired
	private A011O6I00013PrintDao A011O6I00013PrintDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011O6I00013Print () throws Exception {
		String KYAKUSAKIMEISHOU = "1";
		String CHUUMONHIDZUKE1 = "1";


		List<A011O6I00013PrintEntity> returnVal = A011O6I00013PrintDao.A011O6I00013Print(KYAKUSAKIMEISHOU, CHUUMONHIDZUKE1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}