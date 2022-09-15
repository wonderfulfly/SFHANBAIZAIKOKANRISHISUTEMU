package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008DropDownListOption31SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DropDownListOption31SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008DropDownListOption31SYAINMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A008DropDownListOption31SYAINDao
 * @version

 */public class A008DropDownListOption31SYAINDaoTest extends BaseTest {


	@Autowired
	private A008DropDownListOption31SYAINDao A008DropDownListOption31SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void SYAIN31SHAINIDSHAINMEIdrp () throws Exception {


		List<A008DropDownListOption31SYAINEntity> returnVal = A008DropDownListOption31SYAINDao.SYAIN31SHAINIDSHAINMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}