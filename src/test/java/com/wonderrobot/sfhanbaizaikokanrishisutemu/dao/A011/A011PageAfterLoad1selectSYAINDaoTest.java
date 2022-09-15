package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterLoad1selectSYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterLoad1selectSYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1selectSYAINDao
 * @version

 */public class A011PageAfterLoad1selectSYAINDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterLoad1selectSYAINDao A011PageAfterLoad1selectSYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterLoad1selectSYAIN () throws Exception {
		String ROGUINID = "1";


		List<A011PageAfterLoad1selectSYAINEntity> returnVal = A011PageAfterLoad1selectSYAINDao.A011PageAfterLoad1selectSYAIN(ROGUINID);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}