package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013TANTOUSYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013TANTOUSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013TANTOUSYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013TANTOUSYAINDao
 * @version

 */public class A013TANTOUSYAINDaoTest extends BaseTest {


	@Autowired
	private A013TANTOUSYAINDao A013TANTOUSYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013TANTOUdrp () throws Exception {


		List<A013TANTOUSYAINEntity> returnVal = A013TANTOUSYAINDao.A013TANTOUdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}