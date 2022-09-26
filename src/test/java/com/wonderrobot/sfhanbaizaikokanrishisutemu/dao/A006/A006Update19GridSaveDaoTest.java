package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006Update19GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006Update19GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Update19GridSaveDao
 * @version

 */public class A006Update19GridSaveDaoTest extends BaseTest {


	@Autowired
	private A006Update19GridSaveDao A006Update19GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006Update19GridSaveData () throws Exception {
		String SHOUHINMEISHOU = "1";
		String ZAISHITSU = "1";
		String TSUKAMATSUNYUUSAKI = "1";
		String NYUUKAHIDZUKE = "1";
		String PRICE = "1";
		String ZAIKOSUURYOU = "1";
		String SHOUHINNO = "1";
		String SHOUHINNO1 = "1";


		int returnVal = A006Update19GridSaveDao.A006Update19GridSaveData(SHOUHINMEISHOU, ZAISHITSU, TSUKAMATSUNYUUSAKI, NYUUKAHIDZUKE, PRICE, ZAIKOSUURYOU, SHOUHINNO, SHOUHINNO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}