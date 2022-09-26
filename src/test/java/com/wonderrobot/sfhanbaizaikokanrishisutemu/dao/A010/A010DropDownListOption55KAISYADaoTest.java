package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010DropDownListOption55KAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DropDownListOption55KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010DropDownListOption55KAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A010DropDownListOption55KAISYADao
 * @version

 */public class A010DropDownListOption55KAISYADaoTest extends BaseTest {


	@Autowired
	private A010DropDownListOption55KAISYADao A010DropDownListOption55KAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void KAISYA55KAISHAIDKAISHAMEIdrp () throws Exception {


		List<A010DropDownListOption55KAISYAEntity> returnVal = A010DropDownListOption55KAISYADao.KAISYA55KAISHAIDKAISHAMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}