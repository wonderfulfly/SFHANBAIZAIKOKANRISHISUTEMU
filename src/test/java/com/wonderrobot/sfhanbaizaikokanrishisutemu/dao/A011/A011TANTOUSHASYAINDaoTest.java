package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011TANTOUSHASYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TANTOUSHASYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011TANTOUSHASYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011TANTOUSHASYAINDao
 * @version

 */public class A011TANTOUSHASYAINDaoTest extends BaseTest {


	@Autowired
	private A011TANTOUSHASYAINDao A011TANTOUSHASYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011TANTOUSHAdrp () throws Exception {


		List<A011TANTOUSHASYAINEntity> returnVal = A011TANTOUSHASYAINDao.A011TANTOUSHAdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}