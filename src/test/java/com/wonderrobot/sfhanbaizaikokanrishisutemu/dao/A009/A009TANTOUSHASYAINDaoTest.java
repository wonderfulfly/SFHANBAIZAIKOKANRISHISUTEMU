package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009TANTOUSHASYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009TANTOUSHASYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009TANTOUSHASYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009TANTOUSHASYAINDao
 * @version

 */public class A009TANTOUSHASYAINDaoTest extends BaseTest {


	@Autowired
	private A009TANTOUSHASYAINDao A009TANTOUSHASYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009TANTOUSHAdrp () throws Exception {


		List<A009TANTOUSHASYAINEntity> returnVal = A009TANTOUSHASYAINDao.A009TANTOUSHAdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}