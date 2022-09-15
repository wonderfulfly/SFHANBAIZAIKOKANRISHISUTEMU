package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013HINMEI1ChangeselectBUHINSYOUSAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013HINMEI1ChangeselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013HINMEI1ChangeselectBUHINSYOUSAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013HINMEI1ChangeselectBUHINSYOUSAIDao
 * @version

 */public class A013HINMEI1ChangeselectBUHINSYOUSAIDaoTest extends BaseTest {


	@Autowired
	private A013HINMEI1ChangeselectBUHINSYOUSAIDao A013HINMEI1ChangeselectBUHINSYOUSAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013HINMEI1ChangeselectBUHINSYOUSAI () throws Exception {
		String HINMEI = "1";


		List<A013HINMEI1ChangeselectBUHINSYOUSAIEntity> returnVal = A013HINMEI1ChangeselectBUHINSYOUSAIDao.A013HINMEI1ChangeselectBUHINSYOUSAI(HINMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}