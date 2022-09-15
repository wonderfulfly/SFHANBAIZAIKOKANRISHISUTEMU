package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010DropDownListOption59SYAINDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DropDownListOption59SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010DropDownListOption59SYAINMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A010DropDownListOption59SYAINDao
 * @version

 */public class A010DropDownListOption59SYAINDaoTest extends BaseTest {


	@Autowired
	private A010DropDownListOption59SYAINDao A010DropDownListOption59SYAINDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void SYAIN59SHAINIDSHAINMEIdrp () throws Exception {


		List<A010DropDownListOption59SYAINEntity> returnVal = A010DropDownListOption59SYAINDao.SYAIN59SHAINIDSHAINMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}