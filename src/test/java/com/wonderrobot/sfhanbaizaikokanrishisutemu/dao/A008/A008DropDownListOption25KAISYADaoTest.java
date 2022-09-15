package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008DropDownListOption25KAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DropDownListOption25KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008DropDownListOption25KAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A008DropDownListOption25KAISYADao
 * @version

 */public class A008DropDownListOption25KAISYADaoTest extends BaseTest {


	@Autowired
	private A008DropDownListOption25KAISYADao A008DropDownListOption25KAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void KAISYA25KAISHAIDKAISHAMEIdrp () throws Exception {


		List<A008DropDownListOption25KAISYAEntity> returnVal = A008DropDownListOption25KAISYADao.KAISYA25KAISHAIDKAISHAMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}