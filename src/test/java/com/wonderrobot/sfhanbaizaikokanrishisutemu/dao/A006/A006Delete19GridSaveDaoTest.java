package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006Delete19GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006Delete19GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Delete19GridSaveDao
 * @version

 */public class A006Delete19GridSaveDaoTest extends BaseTest {


	@Autowired
	private A006Delete19GridSaveDao A006Delete19GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006Delete19GridSaveData () throws Exception {
		String SHOUHINNO = "1";


		int returnVal = A006Delete19GridSaveDao.A006Delete19GridSaveData(SHOUHINNO);
		Assert.assertTrue("データ削除時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}