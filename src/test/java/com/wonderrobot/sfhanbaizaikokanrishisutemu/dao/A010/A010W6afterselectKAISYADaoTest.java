package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectKAISYADao
 * @version

 */public class A010W6afterselectKAISYADaoTest extends BaseTest {


	@Autowired
	private A010W6afterselectKAISYADao A010W6afterselectKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterselectKAISYA () throws Exception {
		String MITUMORIRINJIHYOU_KYAKUSAKI = "1";


		List<A010W6afterselectKAISYAEntity> returnVal = A010W6afterselectKAISYADao.A010W6afterselectKAISYA(MITUMORIRINJIHYOU_KYAKUSAKI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}