package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010TANTOUSHAIDSYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TANTOUSHAIDSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010TANTOUSHAIDSYAINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010TANTOUSHAIDSYAINDao
 * @version

 */public class A010TANTOUSHAIDSYAINDaoTest extends BaseTest {


	@Autowired
	private A010TANTOUSHAIDSYAINDao A010TANTOUSHAIDSYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010TANTOUSHAIDdrp () throws Exception {


		List<A010TANTOUSHAIDSYAINEntity> returnVal = A010TANTOUSHAIDSYAINDao.A010TANTOUSHAIDdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}