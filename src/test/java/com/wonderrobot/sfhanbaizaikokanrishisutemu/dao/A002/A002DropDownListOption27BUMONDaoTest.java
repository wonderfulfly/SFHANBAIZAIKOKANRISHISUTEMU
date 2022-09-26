package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002DropDownListOption27BUMONDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002DropDownListOption27BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002DropDownListOption27BUMONMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A002DropDownListOption27BUMONDao
 * @version

 */public class A002DropDownListOption27BUMONDaoTest extends BaseTest {


	@Autowired
	private A002DropDownListOption27BUMONDao A002DropDownListOption27BUMONDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void BUMON27BUMONIDBUMONMEIdrp () throws Exception {


		List<A002DropDownListOption27BUMONEntity> returnVal = A002DropDownListOption27BUMONDao.BUMON27BUMONIDBUMONMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}