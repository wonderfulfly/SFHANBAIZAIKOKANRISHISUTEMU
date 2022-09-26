package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006DropDownListOption25I00001Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006DropDownListOption25I00001Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006DropDownListOption25I00001Mapper;

/**
 * @project
 *     null
 * @comment
 *      class: A006DropDownListOption25I00001Dao
 * @version

 */public class A006DropDownListOption25I00001DaoTest extends BaseTest {


	@Autowired
	private A006DropDownListOption25I00001Dao A006DropDownListOption25I00001Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void I0000125KAISHAIDKAISHAMEIdrp () throws Exception {


		List<A006DropDownListOption25I00001Entity> returnVal = A006DropDownListOption25I00001Dao.I0000125KAISHAIDKAISHAMEIdrp();
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}