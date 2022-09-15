package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008I6grdB8SmartSearchDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008I6grdB8SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008I6grdB8SmartSearchMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A008I6grdB8SmartSearchDao
 * @version

 */public class A008I6grdB8SmartSearchDaoTest extends BaseTest {


	@Autowired
	private A008I6grdB8SmartSearchDao A008I6grdB8SmartSearchDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A008I6grdB8SmartSearch () throws Exception {
		String KYAKUSAKI = "1";
		String CHUUMONHIDZUKE = "1";


		List<A008I6grdB8SmartSearchEntity> returnVal = A008I6grdB8SmartSearchDao.A008I6grdB8SmartSearch(KYAKUSAKI, CHUUMONHIDZUKE);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}