package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010KYAKUSAKIIDKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010KYAKUSAKIIDKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010KYAKUSAKIIDKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010KYAKUSAKIIDKAISYADao
 * @version

 */public class A010KYAKUSAKIIDKAISYADaoTest extends BaseTest {


	@Autowired
	private A010KYAKUSAKIIDKAISYADao A010KYAKUSAKIIDKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010KYAKUSAKIIDdrp () throws Exception {


		List<A010KYAKUSAKIIDKAISYAEntity> returnVal = A010KYAKUSAKIIDKAISYADao.A010KYAKUSAKIIDdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}