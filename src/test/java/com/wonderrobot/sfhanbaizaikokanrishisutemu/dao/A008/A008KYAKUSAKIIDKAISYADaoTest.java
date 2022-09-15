package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008KYAKUSAKIIDKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008KYAKUSAKIIDKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008KYAKUSAKIIDKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008KYAKUSAKIIDKAISYADao
 * @version

 */public class A008KYAKUSAKIIDKAISYADaoTest extends BaseTest {


	@Autowired
	private A008KYAKUSAKIIDKAISYADao A008KYAKUSAKIIDKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A008KYAKUSAKIIDdrp () throws Exception {


		List<A008KYAKUSAKIIDKAISYAEntity> returnVal = A008KYAKUSAKIIDKAISYADao.A008KYAKUSAKIIDdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}