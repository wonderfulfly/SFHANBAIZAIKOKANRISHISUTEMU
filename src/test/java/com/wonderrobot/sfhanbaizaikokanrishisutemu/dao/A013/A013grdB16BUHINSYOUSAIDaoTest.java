package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16BUHINSYOUSAIDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16BUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16BUHINSYOUSAIMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16BUHINSYOUSAIDao
 * @version

 */public class A013grdB16BUHINSYOUSAIDaoTest extends BaseTest {


	@Autowired
	private A013grdB16BUHINSYOUSAIDao A013grdB16BUHINSYOUSAIDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A013InitGrid () throws Exception {
		String BUHINCHUUBUNSHOMEISAINO = "1";
		String BUHINCHUUBUNSHONO = "1";
		String KOUJIKANRIBANGOU1 = "1";


		List<A013grdB16BUHINSYOUSAIEntity> returnVal = A013grdB16BUHINSYOUSAIDao.A013InitGrid(BUHINCHUUBUNSHOMEISAINO, BUHINCHUUBUNSHONO, KOUJIKANRIBANGOU1);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}