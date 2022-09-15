package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015.A015grdB6KAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015grdB6KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A015.A015grdB6KAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A015grdB6KAISYADao
 * @version

 */public class A015grdB6KAISYADaoTest extends BaseTest {


	@Autowired
	private A015grdB6KAISYADao A015grdB6KAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A015InitGrid () throws Exception {


		List<A015grdB6KAISYAEntity> returnVal = A015grdB6KAISYADao.A015InitGrid();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}