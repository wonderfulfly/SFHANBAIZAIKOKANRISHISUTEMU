package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013Delete99GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013Delete99GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013Delete99GridSaveDao
 * @version

 */public class A013Delete99GridSaveDaoTest extends BaseTest {


	@Autowired
	private A013Delete99GridSaveDao A013Delete99GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013Delete99GridSaveData () throws Exception {
		String CHUUBUNSHONO = "1";
		String CHUUBUNSHOMEISAINO = "1";
		String HINBANNO = "1";


		int returnVal = A013Delete99GridSaveDao.A013Delete99GridSaveData(CHUUBUNSHONO, CHUUBUNSHOMEISAINO, HINBANNO);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}