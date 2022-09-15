package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8ZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8ZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8ZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8ZAIKOUDao
 * @version

 */public class A007grdB8ZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A007grdB8ZAIKOUDao A007grdB8ZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007InitGrid () throws Exception {


		List<A007grdB8ZAIKOUEntity> returnVal = A007grdB8ZAIKOUDao.A007InitGrid();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}