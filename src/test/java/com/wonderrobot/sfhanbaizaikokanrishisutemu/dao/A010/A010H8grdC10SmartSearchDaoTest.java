package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010H8grdC10SmartSearchDao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010H8grdC10SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010H8grdC10SmartSearchMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A010H8grdC10SmartSearchDao
 * @version

 */public class A010H8grdC10SmartSearchDaoTest extends BaseTest {


	@Autowired
	private A010H8grdC10SmartSearchDao A010H8grdC10SmartSearchDao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010H8grdC10SmartSearch () throws Exception {
		String _ = "1";
		String CHUUMONBI = "1";
		String CHUUMONNO = "1";
		String KOUJIBANGOU = "1";
		String KYAKUSAKIID = "1";
		String MITSUMORINO = "1";
		String TANTOUSHAID = "1";
		String SHUKKOJOUTAI = "1";


		List<A010H8grdC10SmartSearchEntity> returnVal = A010H8grdC10SmartSearchDao.A010H8grdC10SmartSearch(_, CHUUMONBI, CHUUMONNO, KOUJIBANGOU, KYAKUSAKIID, MITSUMORINO, TANTOUSHAID, SHUKKOJOUTAI);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}