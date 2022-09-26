package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006Insert19GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006Insert19GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Insert19GridSaveDao
 * @version

 */public class A006Insert19GridSaveDaoTest extends BaseTest {


	@Autowired
	private A006Insert19GridSaveDao A006Insert19GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006Insert19GridSaveData () throws Exception {
		String SHOUHINMEISHOU = "1";
		String ZAISHITSU = "1";
		String TSUKAMATSUNYUUSAKI = "1";
		String NYUUKAHIDZUKE = "1";
		String PRICE = "1";
		String ZAIKOSUURYOU = "1";
		String SHOUHINNO = "1";


		int returnVal = A006Insert19GridSaveDao.A006Insert19GridSaveData(SHOUHINMEISHOU, ZAISHITSU, TSUKAMATSUNYUUSAKI, NYUUKAHIDZUKE, PRICE, ZAIKOSUURYOU, SHOUHINNO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}