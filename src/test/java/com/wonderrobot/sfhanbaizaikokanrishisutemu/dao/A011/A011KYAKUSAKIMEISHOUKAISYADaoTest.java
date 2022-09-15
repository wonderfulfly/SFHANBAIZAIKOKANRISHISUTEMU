package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011KYAKUSAKIMEISHOUKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOUKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011KYAKUSAKIMEISHOUKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011KYAKUSAKIMEISHOUKAISYADao
 * @version

 */public class A011KYAKUSAKIMEISHOUKAISYADaoTest extends BaseTest {


	@Autowired
	private A011KYAKUSAKIMEISHOUKAISYADao A011KYAKUSAKIMEISHOUKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011KYAKUSAKIMEISHOUdrp () throws Exception {


		List<A011KYAKUSAKIMEISHOUKAISYAEntity> returnVal = A011KYAKUSAKIMEISHOUKAISYADao.A011KYAKUSAKIMEISHOUdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}