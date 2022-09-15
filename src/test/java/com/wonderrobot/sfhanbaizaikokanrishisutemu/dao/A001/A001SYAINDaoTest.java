package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001SYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001SYAINDao
 * @version

 */public class A001SYAINDaoTest extends BaseTest {


	@Autowired
	private A001SYAINDao A001SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A001InitDepthZero () throws Exception {
		String SHAINID1 = "1";
		String ROGUINID1 = "1";


		List<A001SYAINEntity> returnVal = A001SYAINDao.A001InitDepthZero(SHAINID1, ROGUINID1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}