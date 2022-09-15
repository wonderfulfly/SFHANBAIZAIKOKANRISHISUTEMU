package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002grdB6SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002grdB6SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002grdB6SYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002grdB6SYAINDao
 * @version

 */public class A002grdB6SYAINDaoTest extends BaseTest {


	@Autowired
	private A002grdB6SYAINDao A002grdB6SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A002InitGrid () throws Exception {


		List<A002grdB6SYAINEntity> returnVal = A002grdB6SYAINDao.A002InitGrid();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}