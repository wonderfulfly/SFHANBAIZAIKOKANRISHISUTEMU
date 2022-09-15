package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteMITUMORIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteMITUMORIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteMITUMORIDao
 * @version

 */public class A010grdC10AD101ClickdeleteMITUMORIDaoTest extends BaseTest {


	@Autowired
	private A010grdC10AD101ClickdeleteMITUMORIDao A010grdC10AD101ClickdeleteMITUMORIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010grdC10AD101ClickdeleteMITUMORI () throws Exception {
		String MITSUMORISHONO = "1";


		int returnVal = A010grdC10AD101ClickdeleteMITUMORIDao.A010grdC10AD101ClickdeleteMITUMORI(MITSUMORISHONO);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}