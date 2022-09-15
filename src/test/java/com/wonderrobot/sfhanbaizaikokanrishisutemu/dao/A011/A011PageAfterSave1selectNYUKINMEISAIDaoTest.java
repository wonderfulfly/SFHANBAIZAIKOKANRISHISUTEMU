package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectNYUKINMEISAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectNYUKINMEISAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectNYUKINMEISAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectNYUKINMEISAIDao
 * @version

 */public class A011PageAfterSave1selectNYUKINMEISAIDaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1selectNYUKINMEISAIDao A011PageAfterSave1selectNYUKINMEISAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1selectNYUKINMEISAI () throws Exception {
		String ay2_TYUMONSYO_RESHIITONO = "1";


		List<A011PageAfterSave1selectNYUKINMEISAIEntity> returnVal = A011PageAfterSave1selectNYUKINMEISAIDao.A011PageAfterSave1selectNYUKINMEISAI(ay2_TYUMONSYO_RESHIITONO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}