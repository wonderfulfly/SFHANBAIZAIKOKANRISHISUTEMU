package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007Y61ClickselectZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007Y61ClickselectZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007Y61ClickselectZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007Y61ClickselectZAIKOUDao
 * @version

 */public class A007Y61ClickselectZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A007Y61ClickselectZAIKOUDao A007Y61ClickselectZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A007Y61ClickselectZAIKOU () throws Exception {
		String CHUUBUNSHONO = "1";
		String BUHINMEI = "1";
		String ZAIKONO = "1";
		String SHANAIKOUJIBANGOU = "1";


		List<A007Y61ClickselectZAIKOUEntity> returnVal = A007Y61ClickselectZAIKOUDao.A007Y61ClickselectZAIKOU(CHUUBUNSHONO, BUHINMEI, ZAIKONO, SHANAIKOUJIBANGOU);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}