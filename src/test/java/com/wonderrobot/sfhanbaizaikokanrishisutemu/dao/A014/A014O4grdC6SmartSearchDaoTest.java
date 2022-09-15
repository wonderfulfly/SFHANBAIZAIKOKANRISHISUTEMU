package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014.A014O4grdC6SmartSearchDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014O4grdC6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A014.A014O4grdC6SmartSearchMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A014O4grdC6SmartSearchDao
 * @version

 */public class A014O4grdC6SmartSearchDaoTest extends BaseTest {


	@Autowired
	private A014O4grdC6SmartSearchDao A014O4grdC6SmartSearchDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A014O4grdC6SmartSearch () throws Exception {
		String BUMONID = "1";
		String BUMONMEI = "1";


		List<A014O4grdC6SmartSearchEntity> returnVal = A014O4grdC6SmartSearchDao.A014O4grdC6SmartSearch(BUMONID, BUMONMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}