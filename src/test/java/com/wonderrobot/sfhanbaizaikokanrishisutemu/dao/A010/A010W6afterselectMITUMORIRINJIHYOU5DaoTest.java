package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.BaseTest;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU5Dao;
import org.springframework.test.annotation.Rollback;
import org.junit.Assert;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU5Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOU5Mapper;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOU5Dao
 * @version

 */public class A010W6afterselectMITUMORIRINJIHYOU5DaoTest extends BaseTest {


	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU5Dao A010W6afterselectMITUMORIRINJIHYOU5Dao;
	/**
	 * Test Methods
	 *
	 */
    @Test
    @Rollback
	public void A010W6afterselectMITUMORIRINJIHYOU5 () throws Exception {
		String MITUMORIRINJIHYOU_MITSUMORINO = "1";
		String ROGUINID_RUUPUKAISHI_ = "1";


		List<A010W6afterselectMITUMORIRINJIHYOU5Entity> returnVal = A010W6afterselectMITUMORIRINJIHYOU5Dao.A010W6afterselectMITUMORIRINJIHYOU5(MITUMORIRINJIHYOU_MITSUMORINO, ROGUINID_RUUPUKAISHI_);
		Assert.assertTrue("データ検索時エラーが発生しました", returnVal.size() > 0);
		System.out.println(returnVal);

	}

}