package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C4I00005ExportDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A005.A005C4I00005ExportEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C4I00005ExportMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A005C4I00005ExportDao
 * @version

 */public class A005C4I00005ExportDaoTest extends BaseTest {


	@Autowired
	private A005C4I00005ExportDao A005C4I00005ExportDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A005C4I00005Export () throws Exception {


		List<A005C4I00005ExportEntity> returnVal = A005C4I00005ExportDao.A005C4I00005Export();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}