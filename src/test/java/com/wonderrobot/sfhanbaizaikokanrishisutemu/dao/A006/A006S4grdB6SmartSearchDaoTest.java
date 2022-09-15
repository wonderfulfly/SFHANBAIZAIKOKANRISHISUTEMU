package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006S4grdB6SmartSearchDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006S4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006S4grdB6SmartSearchMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A006S4grdB6SmartSearchDao
 * @version

 */public class A006S4grdB6SmartSearchDaoTest extends BaseTest {


	@Autowired
	private A006S4grdB6SmartSearchDao A006S4grdB6SmartSearchDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006S4grdB6SmartSearch () throws Exception {
		String KAISHAMEI = "1";
		String SHOUHINMEI = "1";


		List<A006S4grdB6SmartSearchEntity> returnVal = A006S4grdB6SmartSearchDao.A006S4grdB6SmartSearch(KAISHAMEI, SHOUHINMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}