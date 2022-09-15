package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013I00007Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013I00007Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013I00007Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013I00007Dao
 * @version

 */public class A013I00007DaoTest extends BaseTest {


	@Autowired
	private A013I00007Dao A013I00007Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013AA71selectI00007FuncPrint () throws Exception {
		String BUHINCHUUBUNSHONO = "1";
		String BUHINCHUUBUNSHOMEISAINO = "1";


		List<A013I00007Entity> returnVal = A013I00007Dao.A013AA71selectI00007FuncPrint(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}