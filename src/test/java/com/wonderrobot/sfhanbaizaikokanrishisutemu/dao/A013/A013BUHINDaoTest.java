package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013BUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013BUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013BUHINDao
 * @version

 */public class A013BUHINDaoTest extends BaseTest {


	@Autowired
	private A013BUHINDao A013BUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013InitDepthZero () throws Exception {
		String BUHINCHUUBUNSHONO = "1";
		String KOUJIKANRIBANGOU1 = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";


		List<A013BUHINEntity> returnVal = A013BUHINDao.A013InitDepthZero(BUHINCHUUBUNSHONO, KOUJIKANRIBANGOU1, BUHINCHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}