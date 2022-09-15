package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004KAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004KAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004KAISYADao
 * @version

 */public class A004KAISYADaoTest extends BaseTest {


	@Autowired
	private A004KAISYADao A004KAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A004InitDepthZero () throws Exception {
		String KAISHAID1 = "1";


		List<A004KAISYAEntity> returnVal = A004KAISYADao.A004InitDepthZero(KAISHAID1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}