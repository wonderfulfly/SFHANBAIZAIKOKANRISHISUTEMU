package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011grdB18W181ClickselectBUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18W181ClickselectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011grdB18W181ClickselectBUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011grdB18W181ClickselectBUHINDao
 * @version

 */public class A011grdB18W181ClickselectBUHINDaoTest extends BaseTest {


	@Autowired
	private A011grdB18W181ClickselectBUHINDao A011grdB18W181ClickselectBUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011grdB18W181ClickselectBUHIN () throws Exception {
		String CHUUBUNSHONO1 = "1";
		String CHUUBUNSHOMEISAINO = "1";


		List<A011grdB18W181ClickselectBUHINEntity> returnVal = A011grdB18W181ClickselectBUHINDao.A011grdB18W181ClickselectBUHIN(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}