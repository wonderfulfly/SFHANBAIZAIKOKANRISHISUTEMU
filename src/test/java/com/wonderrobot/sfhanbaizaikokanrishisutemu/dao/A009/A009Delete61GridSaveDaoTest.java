package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009Delete61GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009Delete61GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009Delete61GridSaveDao
 * @version

 */public class A009Delete61GridSaveDaoTest extends BaseTest {


	@Autowired
	private A009Delete61GridSaveDao A009Delete61GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009Delete61GridSaveData () throws Exception {
		String RESHIITONO = "1";
		String RESHIITOMEISAINO = "1";


		int returnVal = A009Delete61GridSaveDao.A009Delete61GridSaveData(RESHIITONO, RESHIITOMEISAINO);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}