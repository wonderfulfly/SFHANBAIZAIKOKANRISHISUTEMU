package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009KANTOKU1SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009KANTOKU1SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009KANTOKU1SYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009KANTOKU1SYAINDao
 * @version

 */public class A009KANTOKU1SYAINDaoTest extends BaseTest {


	@Autowired
	private A009KANTOKU1SYAINDao A009KANTOKU1SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009KANTOKU1drp () throws Exception {


		List<A009KANTOKU1SYAINEntity> returnVal = A009KANTOKU1SYAINDao.A009KANTOKU1drp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}