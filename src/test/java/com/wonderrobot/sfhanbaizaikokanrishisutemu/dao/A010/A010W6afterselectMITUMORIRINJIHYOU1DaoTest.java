package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU1Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOU1Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOU1Dao
 * @version

 */public class A010W6afterselectMITUMORIRINJIHYOU1DaoTest extends BaseTest {


	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU1Dao A010W6afterselectMITUMORIRINJIHYOU1Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterselectMITUMORIRINJIHYOU1 () throws Exception {
		String ROGUINID = "1";


		List<Double> returnVal = A010W6afterselectMITUMORIRINJIHYOU1Dao.A010W6afterselectMITUMORIRINJIHYOU1(ROGUINID);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}