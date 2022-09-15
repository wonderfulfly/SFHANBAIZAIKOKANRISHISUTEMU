package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014.A014grdC6BUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014grdC6BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A014.A014grdC6BUMONMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014grdC6BUMONDao
 * @version

 */public class A014grdC6BUMONDaoTest extends BaseTest {


	@Autowired
	private A014grdC6BUMONDao A014grdC6BUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A014InitGrid () throws Exception {


		List<A014grdC6BUMONEntity> returnVal = A014grdC6BUMONDao.A014InitGrid();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}