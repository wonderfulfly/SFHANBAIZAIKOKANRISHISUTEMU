package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterLoad1selectTYUMONSYODao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectTYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterLoad1selectTYUMONSYOMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1selectTYUMONSYODao
 * @version

 */public class A011PageAfterLoad1selectTYUMONSYODaoTest extends BaseTest {


	@Autowired
	private A011PageAfterLoad1selectTYUMONSYODao A011PageAfterLoad1selectTYUMONSYODao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterLoad1selectTYUMONSYO () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011PageAfterLoad1selectTYUMONSYOEntity> returnVal = A011PageAfterLoad1selectTYUMONSYODao.A011PageAfterLoad1selectTYUMONSYO(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}