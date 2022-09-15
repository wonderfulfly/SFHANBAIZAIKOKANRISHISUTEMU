package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectZAIKOUDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickselectZAIKOUMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickselectZAIKOUDao
 * @version

 */public class A011W41ClickselectZAIKOUDaoTest extends BaseTest {


	@Autowired
	private A011W41ClickselectZAIKOUDao A011W41ClickselectZAIKOUDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011W41ClickselectZAIKOU () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011W41ClickselectZAIKOUEntity> returnVal = A011W41ClickselectZAIKOUDao.A011W41ClickselectZAIKOU(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}