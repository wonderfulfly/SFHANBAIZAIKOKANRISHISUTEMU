package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectTYUMONSYO1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYO1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectTYUMONSYO1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectTYUMONSYO1Dao
 * @version

 */public class A011PageAfterSave1selectTYUMONSYO1DaoTest extends BaseTest {


	@Autowired
	private A011PageAfterSave1selectTYUMONSYO1Dao A011PageAfterSave1selectTYUMONSYO1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011PageAfterSave1selectTYUMONSYO1 () throws Exception {
		String CHUUBUNSHONO1 = "1";


		List<A011PageAfterSave1selectTYUMONSYO1Entity> returnVal = A011PageAfterSave1selectTYUMONSYO1Dao.A011PageAfterSave1selectTYUMONSYO1(CHUUBUNSHONO1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}