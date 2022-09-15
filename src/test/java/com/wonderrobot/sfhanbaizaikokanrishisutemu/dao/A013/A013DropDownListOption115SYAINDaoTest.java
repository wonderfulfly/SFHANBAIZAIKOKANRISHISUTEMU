package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013DropDownListOption115SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013DropDownListOption115SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013DropDownListOption115SYAINMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A013DropDownListOption115SYAINDao
 * @version

 */public class A013DropDownListOption115SYAINDaoTest extends BaseTest {


	@Autowired
	private A013DropDownListOption115SYAINDao A013DropDownListOption115SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void SYAIN115SHAINIDSHAINMEIdrp () throws Exception {


		List<A013DropDownListOption115SYAINEntity> returnVal = A013DropDownListOption115SYAINDao.SYAIN115SHAINIDSHAINMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}