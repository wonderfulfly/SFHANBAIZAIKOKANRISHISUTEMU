package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectBUHINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectBUHINMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectBUHINDao
 * @version

 */public class A011PageAfterSave1selectBUHINDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1selectBUHINDao A011PageAfterSave1selectBUHINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1selectBUHIN () throws Exception {
		String ay6_TYUMONSYO_CHUUBUNSHONO = "1";
		String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO = "1";


		List<A011PageAfterSave1selectBUHINEntity> returnVal = A011PageAfterSave1selectBUHINDao.A011PageAfterSave1selectBUHIN(ay6_TYUMONSYO_CHUUBUNSHONO, ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}