package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015.A015O4grdB6SmartSearchDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015O4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A015.A015O4grdB6SmartSearchMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A015O4grdB6SmartSearchDao
 * @version

 */public class A015O4grdB6SmartSearchDaoTest extends BaseTest {


	@Autowired
	private A015O4grdB6SmartSearchDao A015O4grdB6SmartSearchDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A015O4grdB6SmartSearch () throws Exception {
		String KAISHAID = "1";
		String KAISHAMEI = "1";


		List<A015O4grdB6SmartSearchEntity> returnVal = A015O4grdB6SmartSearchDao.A015O4grdB6SmartSearch(KAISHAID, KAISHAMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}