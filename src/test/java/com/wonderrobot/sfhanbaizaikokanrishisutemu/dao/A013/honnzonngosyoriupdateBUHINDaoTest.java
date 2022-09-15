package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriupdateBUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriupdateBUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriupdateBUHINDao
 * @version

 */public class honnzonngosyoriupdateBUHINDaoTest extends BaseTest {


	@Autowired
	private honnzonngosyoriupdateBUHINDao honnzonngosyoriupdateBUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void honnzonngosyoriupdateBUHIN () throws Exception {
		double JPYGOUKEI2 = 0.0;
		double RMBGOUKEI2 = 0.0;
		double USDGOUKEI2 = 0.0;
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String KOUJIKANRIBANGOU1 = "1";


		int returnVal = honnzonngosyoriupdateBUHINDao.honnzonngosyoriupdateBUHIN(JPYGOUKEI2, RMBGOUKEI2, USDGOUKEI2, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}