package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008KYAKUSAKIKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008KYAKUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008KYAKUSAKIKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008KYAKUSAKIKAISYADao
 * @version

 */public class A008KYAKUSAKIKAISYADaoTest extends BaseTest {


	@Autowired
	private A008KYAKUSAKIKAISYADao A008KYAKUSAKIKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A008KYAKUSAKIdrp () throws Exception {


		List<A008KYAKUSAKIKAISYAEntity> returnVal = A008KYAKUSAKIKAISYADao.A008KYAKUSAKIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}