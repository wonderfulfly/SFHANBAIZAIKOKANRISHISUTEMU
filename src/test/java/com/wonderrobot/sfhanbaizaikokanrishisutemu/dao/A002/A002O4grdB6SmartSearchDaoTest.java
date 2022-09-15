package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002O4grdB6SmartSearchDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002O4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002O4grdB6SmartSearchMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A002O4grdB6SmartSearchDao
 * @version

 */public class A002O4grdB6SmartSearchDaoTest extends BaseTest {


	@Autowired
	private A002O4grdB6SmartSearchDao A002O4grdB6SmartSearchDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A002O4grdB6SmartSearch () throws Exception {
		String SHAINID = "1";
		String SHAINMEI = "1";


		List<A002O4grdB6SmartSearchEntity> returnVal = A002O4grdB6SmartSearchDao.A002O4grdB6SmartSearch(SHAINID, SHAINMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}