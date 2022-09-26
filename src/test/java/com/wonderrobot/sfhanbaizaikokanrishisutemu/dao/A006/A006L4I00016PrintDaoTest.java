package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006L4I00016PrintDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006L4I00016PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006L4I00016PrintMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A006L4I00016PrintDao
 * @version

 */public class A006L4I00016PrintDaoTest extends BaseTest {


	@Autowired
	private A006L4I00016PrintDao A006L4I00016PrintDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006L4I00016Print () throws Exception {
		String KAISHAMEI = "1";
		String SHOUHINMEI = "1";


		List<A006L4I00016PrintEntity> returnVal = A006L4I00016PrintDao.A006L4I00016Print(KAISHAMEI, SHOUHINMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}