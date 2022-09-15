package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W61ClickselectNYUKINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W61ClickselectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W61ClickselectNYUKINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W61ClickselectNYUKINDao
 * @version

 */public class A011W61ClickselectNYUKINDaoTest extends BaseTest {


	@Autowired
	private A011W61ClickselectNYUKINDao A011W61ClickselectNYUKINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011W61ClickselectNYUKIN () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011W61ClickselectNYUKINEntity> returnVal = A011W61ClickselectNYUKINDao.A011W61ClickselectNYUKIN(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}