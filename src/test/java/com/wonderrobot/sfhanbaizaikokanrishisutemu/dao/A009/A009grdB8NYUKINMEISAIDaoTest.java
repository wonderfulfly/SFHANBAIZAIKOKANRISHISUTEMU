package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009grdB8NYUKINMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009grdB8NYUKINMEISAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009grdB8NYUKINMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009grdB8NYUKINMEISAIDao
 * @version

 */public class A009grdB8NYUKINMEISAIDaoTest extends BaseTest {


	@Autowired
	private A009grdB8NYUKINMEISAIDao A009grdB8NYUKINMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009InitGrid () throws Exception {
		String RYOUSHUUSHONO = "1";


		List<A009grdB8NYUKINMEISAIEntity> returnVal = A009grdB8NYUKINMEISAIDao.A009InitGrid(RYOUSHUUSHONO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}