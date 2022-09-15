package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010TANTOUSHAID1SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TANTOUSHAID1SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010TANTOUSHAID1SYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010TANTOUSHAID1SYAINDao
 * @version

 */public class A010TANTOUSHAID1SYAINDaoTest extends BaseTest {


	@Autowired
	private A010TANTOUSHAID1SYAINDao A010TANTOUSHAID1SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010TANTOUSHAID1drp () throws Exception {


		List<A010TANTOUSHAID1SYAINEntity> returnVal = A010TANTOUSHAID1SYAINDao.A010TANTOUSHAID1drp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}