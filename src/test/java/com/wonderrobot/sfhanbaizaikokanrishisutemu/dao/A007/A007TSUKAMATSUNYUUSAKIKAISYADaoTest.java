package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007TSUKAMATSUNYUUSAKIKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007TSUKAMATSUNYUUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007TSUKAMATSUNYUUSAKIKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007TSUKAMATSUNYUUSAKIKAISYADao
 * @version

 */public class A007TSUKAMATSUNYUUSAKIKAISYADaoTest extends BaseTest {


	@Autowired
	private A007TSUKAMATSUNYUUSAKIKAISYADao A007TSUKAMATSUNYUUSAKIKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007TSUKAMATSUNYUUSAKIdrp () throws Exception {


		List<A007TSUKAMATSUNYUUSAKIKAISYAEntity> returnVal = A007TSUKAMATSUNYUUSAKIKAISYADao.A007TSUKAMATSUNYUUSAKIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}