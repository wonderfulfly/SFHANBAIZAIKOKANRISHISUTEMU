package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriselectBUHINSYOUSAI2Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriselectBUHINSYOUSAI2Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriselectBUHINSYOUSAI2Dao
 * @version

 */public class honnzonngosyoriselectBUHINSYOUSAI2DaoTest extends BaseTest {


	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAI2Dao honnzonngosyoriselectBUHINSYOUSAI2Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void honnzonngosyoriselectBUHINSYOUSAI2 () throws Exception {
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String KOUJIKANRIBANGOU1 = "1";


		List<Double> returnVal = honnzonngosyoriselectBUHINSYOUSAI2Dao.honnzonngosyoriselectBUHINSYOUSAI2(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}