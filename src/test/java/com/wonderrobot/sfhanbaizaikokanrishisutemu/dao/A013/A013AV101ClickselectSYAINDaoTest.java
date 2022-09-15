package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013AV101ClickselectSYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013AV101ClickselectSYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AV101ClickselectSYAINDao
 * @version

 */public class A013AV101ClickselectSYAINDaoTest extends BaseTest {


	@Autowired
	private A013AV101ClickselectSYAINDao A013AV101ClickselectSYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013AV101ClickselectSYAIN () throws Exception {
		String ROGUINID = "1";


		List<A013AV101ClickselectSYAINEntity> returnVal = A013AV101ClickselectSYAINDao.A013AV101ClickselectSYAIN(ROGUINID);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}