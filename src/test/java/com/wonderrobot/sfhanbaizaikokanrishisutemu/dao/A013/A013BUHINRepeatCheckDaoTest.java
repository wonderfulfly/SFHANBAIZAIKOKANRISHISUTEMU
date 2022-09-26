package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013BUHINRepeatCheckDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINRepeatCheckEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013BUHINRepeatCheckMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013BUHINRepeatCheckDao
 * @version

 */public class A013BUHINRepeatCheckDaoTest extends BaseTest {


	@Autowired
	private A013BUHINRepeatCheckDao A013BUHINRepeatCheckDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013BUHINRepeatCheckselectBUHIN () throws Exception {
		String KOUJIKANRIBANGOU1 = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String BUHINCHUUBUNSHONO = "1";


		List<A013BUHINRepeatCheckEntity> returnVal = A013BUHINRepeatCheckDao.A013BUHINRepeatCheckselectBUHIN(KOUJIKANRIBANGOU1, BUHINCHUUBUNSHOMEISAINO, BUHINCHUUBUNSHONO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}