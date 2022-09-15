package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011TYUMONSYODao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011TYUMONSYOMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011TYUMONSYODao
 * @version

 */public class A011TYUMONSYODaoTest extends BaseTest {


	@Autowired
	private A011TYUMONSYODao A011TYUMONSYODao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011InitDepthZero () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011TYUMONSYOEntity> returnVal = A011TYUMONSYODao.A011InitDepthZero(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}