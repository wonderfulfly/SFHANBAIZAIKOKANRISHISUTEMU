package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011grdB18TYUMONSYOMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18TYUMONSYOMEISAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011grdB18TYUMONSYOMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011grdB18TYUMONSYOMEISAIDao
 * @version

 */public class A011grdB18TYUMONSYOMEISAIDaoTest extends BaseTest {


	@Autowired
	private A011grdB18TYUMONSYOMEISAIDao A011grdB18TYUMONSYOMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011InitGrid () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011grdB18TYUMONSYOMEISAIEntity> returnVal = A011grdB18TYUMONSYOMEISAIDao.A011InitGrid(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}