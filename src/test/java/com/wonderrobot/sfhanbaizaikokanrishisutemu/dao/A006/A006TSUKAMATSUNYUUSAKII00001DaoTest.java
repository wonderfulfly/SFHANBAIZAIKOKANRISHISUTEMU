package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006TSUKAMATSUNYUUSAKII00001Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006TSUKAMATSUNYUUSAKII00001Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006TSUKAMATSUNYUUSAKII00001Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006TSUKAMATSUNYUUSAKII00001Dao
 * @version

 */public class A006TSUKAMATSUNYUUSAKII00001DaoTest extends BaseTest {


	@Autowired
	private A006TSUKAMATSUNYUUSAKII00001Dao A006TSUKAMATSUNYUUSAKII00001Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006TSUKAMATSUNYUUSAKIdrp () throws Exception {


		List<A006TSUKAMATSUNYUUSAKII00001Entity> returnVal = A006TSUKAMATSUNYUUSAKII00001Dao.A006TSUKAMATSUNYUUSAKIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}