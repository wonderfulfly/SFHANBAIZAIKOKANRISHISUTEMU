package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao
 * @version

 */public class A011KYAKUSAKIMEISHOU1ChangeselectKAISYADaoTest extends BaseTest {


	@Autowired
	private A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A011KYAKUSAKIMEISHOU1ChangeselectKAISYA () throws Exception {
		String KYAKUSAKIMEISHOU = "1";


		List<A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity> returnVal = A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao.A011KYAKUSAKIMEISHOU1ChangeselectKAISYA(KYAKUSAKIMEISHOU);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}