package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006G4I00011PrintDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006G4I00011PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006G4I00011PrintMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A006G4I00011PrintDao
 * @version

 */public class A006G4I00011PrintDaoTest extends BaseTest {


	@Autowired
	private A006G4I00011PrintDao A006G4I00011PrintDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A006G4I00011Print () throws Exception {
		String SHOUHINMEI = "1";
		String KAISHAMEI = "1";


		List<A006G4I00011PrintEntity> returnVal = A006G4I00011PrintDao.A006G4I00011Print(SHOUHINMEI, KAISHAMEI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}