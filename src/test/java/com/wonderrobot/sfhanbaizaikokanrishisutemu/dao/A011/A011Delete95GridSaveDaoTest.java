package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011Delete95GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011Delete95GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Delete95GridSaveDao
 * @version

 */public class A011Delete95GridSaveDaoTest extends BaseTest {


	@Autowired
	private A011Delete95GridSaveDao A011Delete95GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011Delete95GridSaveData () throws Exception {
		String CHUUBUNSHONO = "1";
		String CHUUBUNSHOMEISAINO = "1";


		int returnVal = A011Delete95GridSaveDao.A011Delete95GridSaveData(CHUUBUNSHONO, CHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}