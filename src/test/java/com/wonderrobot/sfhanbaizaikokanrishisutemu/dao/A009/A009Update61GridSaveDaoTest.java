package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009Update61GridSaveDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009Update61GridSaveMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009Update61GridSaveDao
 * @version

 */public class A009Update61GridSaveDaoTest extends BaseTest {


	@Autowired
	private A009Update61GridSaveDao A009Update61GridSaveDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A009Update61GridSaveData () throws Exception {
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
		String RESHIITONO1 = "1";
		String RESHIITOMEISAINO1 = "1";


		int returnVal = A009Update61GridSaveDao.A009Update61GridSaveData(SHIHARAIHIDZUKE, SHIHARAIWARIAI, FURIDASHIZUMIHIDZUKE, FURIDASHIZUMIKINGAKU, FURIDASHIZUMIWARIAI, NYUUKINZUMIHIDZUKE, NYUUKINZUMIKINGAKU, NYUUKINZUMIWARIAI, RESHIITOMEISAINO, RESHIITONO, RESHIITONO1, RESHIITOMEISAINO1);
		Assert.assertTrue("データ更新時エラーが発生しました", returnVal > 0);
		System.out.println(returnVal);

	}

}