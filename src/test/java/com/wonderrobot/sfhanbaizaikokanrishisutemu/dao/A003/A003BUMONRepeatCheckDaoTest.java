package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003BUMONRepeatCheckDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONRepeatCheckEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003BUMONRepeatCheckMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003BUMONRepeatCheckDao
 * @version

 */public class A003BUMONRepeatCheckDaoTest extends BaseTest {


	@Autowired
	private A003BUMONRepeatCheckDao A003BUMONRepeatCheckDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A003BUMONRepeatCheckselectBUMON () throws Exception {
		String BUMONID1 = "1";


		List<A003BUMONRepeatCheckEntity> returnVal = A003BUMONRepeatCheckDao.A003BUMONRepeatCheckselectBUMON(BUMONID1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}