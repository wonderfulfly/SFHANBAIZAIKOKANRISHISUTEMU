package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W2I00015PrintDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W2I00015PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W2I00015PrintMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A010W2I00015PrintDao
 * @version

 */public class A010W2I00015PrintDaoTest extends BaseTest {


	@Autowired
	private A010W2I00015PrintDao A010W2I00015PrintDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W2I00015Print () throws Exception {
		String CHUUMONNO = "1";
		String TANTOUSHAID = "1";
		String KYAKUSAKIID = "1";
		String SHUKKOJOUTAI = "1";


		List<A010W2I00015PrintEntity> returnVal = A010W2I00015PrintDao.A010W2I00015Print(CHUUMONNO, TANTOUSHAID, KYAKUSAKIID, SHUKKOJOUTAI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}