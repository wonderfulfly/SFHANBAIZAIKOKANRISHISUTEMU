package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006grdB6SYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006grdB6SYOUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006grdB6SYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006grdB6SYOUHINDao
 * @version

 */public class A006grdB6SYOUHINDaoTest extends BaseTest {


	@Autowired
	private A006grdB6SYOUHINDao A006grdB6SYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006InitGrid () throws Exception {


		List<A006grdB6SYOUHINEntity> returnVal = A006grdB6SYOUHINDao.A006InitGrid();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}