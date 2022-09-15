package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterLoad1selectBUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterLoad1selectBUMONMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1selectBUMONDao
 * @version

 */public class A011PageAfterLoad1selectBUMONDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterLoad1selectBUMONDao A011PageAfterLoad1selectBUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterLoad1selectBUMON () throws Exception {
		String SYAIN_YUUZAAKENGEN = "1";


		List<A011PageAfterLoad1selectBUMONEntity> returnVal = A011PageAfterLoad1selectBUMONDao.A011PageAfterLoad1selectBUMON(SYAIN_YUUZAAKENGEN);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}