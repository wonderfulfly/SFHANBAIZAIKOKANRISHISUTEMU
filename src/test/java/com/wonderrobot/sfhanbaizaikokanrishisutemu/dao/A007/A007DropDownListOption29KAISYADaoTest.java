package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007DropDownListOption29KAISYADao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007DropDownListOption29KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007DropDownListOption29KAISYAMapper;

/**
 * @project
 *     null
 * @comment
 *      class: A007DropDownListOption29KAISYADao
 * @version

 */public class A007DropDownListOption29KAISYADaoTest extends BaseTest {


	@Autowired
	private A007DropDownListOption29KAISYADao A007DropDownListOption29KAISYADao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void KAISYA29KAISHAIDKAISHAMEIdrp () throws Exception {


		List<A007DropDownListOption29KAISYAEntity> returnVal = A007DropDownListOption29KAISYADao.KAISYA29KAISHAIDKAISHAMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}