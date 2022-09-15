package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickselectBUHINSYOUSAI1Dao
 * @version

 */public class A013grdB16AC161ClickselectBUHINSYOUSAI1DaoTest extends BaseTest {


	@Autowired
	private A013grdB16AC161ClickselectBUHINSYOUSAI1Dao A013grdB16AC161ClickselectBUHINSYOUSAI1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013grdB16AC161ClickselectBUHINSYOUSAI1 () throws Exception {
		String ay4_BUHINSYOUSAI_CHUUBUNSHONO = "1";
		String CHUUBUNSHOMEISAINO1 = "1";
		String KOUJIKANRIBANGOU1 = "1";
		String HINBANNO = "1";


		List<A013grdB16AC161ClickselectBUHINSYOUSAI1Entity> returnVal = A013grdB16AC161ClickselectBUHINSYOUSAI1Dao.A013grdB16AC161ClickselectBUHINSYOUSAI1(ay4_BUHINSYOUSAI_CHUUBUNSHONO, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}