package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010KYAKUSAKIID1KAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010KYAKUSAKIID1KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010KYAKUSAKIID1KAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010KYAKUSAKIID1KAISYADao
 * @version

 */public class A010KYAKUSAKIID1KAISYADaoTest extends BaseTest {


	@Autowired
	private A010KYAKUSAKIID1KAISYADao A010KYAKUSAKIID1KAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010KYAKUSAKIID1drp () throws Exception {


		List<A010KYAKUSAKIID1KAISYAEntity> returnVal = A010KYAKUSAKIID1KAISYADao.A010KYAKUSAKIID1drp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}