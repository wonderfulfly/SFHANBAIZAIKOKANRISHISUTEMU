package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009PageAfterLoad1selectKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterLoad1selectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009PageAfterLoad1selectKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterLoad1selectKAISYADao
 * @version

 */public class A009PageAfterLoad1selectKAISYADaoTest extends BaseTest {


	@Autowired
	private A009PageAfterLoad1selectKAISYADao A009PageAfterLoad1selectKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009PageAfterLoad1selectKAISYA () throws Exception {
		String KYAKUSAKI = "1";


		List<A009PageAfterLoad1selectKAISYAEntity> returnVal = A009PageAfterLoad1selectKAISYADao.A009PageAfterLoad1selectKAISYA(KYAKUSAKI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}