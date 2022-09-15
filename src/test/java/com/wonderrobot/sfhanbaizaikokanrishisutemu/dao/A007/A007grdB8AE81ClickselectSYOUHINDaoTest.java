package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickselectSYOUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8AE81ClickselectSYOUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickselectSYOUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickselectSYOUHINDao
 * @version

 */public class A007grdB8AE81ClickselectSYOUHINDaoTest extends BaseTest {


	@Autowired
	private A007grdB8AE81ClickselectSYOUHINDao A007grdB8AE81ClickselectSYOUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007grdB8AE81ClickselectSYOUHIN () throws Exception {
		String SHOUHINNO = "1";


		List<A007grdB8AE81ClickselectSYOUHINEntity> returnVal = A007grdB8AE81ClickselectSYOUHINDao.A007grdB8AE81ClickselectSYOUHIN(SHOUHINNO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}