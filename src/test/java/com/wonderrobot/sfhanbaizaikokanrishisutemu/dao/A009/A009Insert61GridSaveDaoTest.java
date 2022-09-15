package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009Insert61GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009Insert61GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009Insert61GridSaveDao
 * @version

 */public class A009Insert61GridSaveDaoTest extends BaseTest {


	@Autowired
	private A009Insert61GridSaveDao A009Insert61GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009Insert61GridSaveData () throws Exception {
		String SHIHARAIHIDZUKE = "1";
		String SHIHARAIWARIAI = "1";
		String FURIDASHIZUMIHIDZUKE = "1";
		String FURIDASHIZUMIKINGAKU = "1";
		String FURIDASHIZUMIWARIAI = "1";
		String NYUUKINZUMIHIDZUKE = "1";
		String NYUUKINZUMIKINGAKU = "1";
		String NYUUKINZUMIWARIAI = "1";
		String RESHIITOMEISAINO = "1";
		String RESHIITONO = "1";


		int returnVal = A009Insert61GridSaveDao.A009Insert61GridSaveData(SHIHARAIHIDZUKE, SHIHARAIWARIAI, FURIDASHIZUMIHIDZUKE, FURIDASHIZUMIKINGAKU, FURIDASHIZUMIWARIAI, NYUUKINZUMIHIDZUKE, NYUUKINZUMIKINGAKU, NYUUKINZUMIWARIAI, RESHIITOMEISAINO, RESHIITONO);
		Assert.assertTrue("データ新規時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}