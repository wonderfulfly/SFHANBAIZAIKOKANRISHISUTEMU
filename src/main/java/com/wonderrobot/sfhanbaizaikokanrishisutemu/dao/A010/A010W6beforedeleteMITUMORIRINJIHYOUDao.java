package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6beforedeleteMITUMORIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6beforedeleteMITUMORIRINJIHYOUDao
 * @version

 */

@Repository
public class A010W6beforedeleteMITUMORIRINJIHYOUDao {
	@Autowired
	private A010W6beforedeleteMITUMORIRINJIHYOUMapper A010W6beforedeleteMITUMORIRINJIHYOUMapper;

   
	public int A010W6beforedeleteMITUMORIRINJIHYOU (String ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU) throws Exception {

		int returnVal = A010W6beforedeleteMITUMORIRINJIHYOUMapper.A010W6beforedeleteMITUMORIRINJIHYOU(ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU);
		return returnVal;
	}
}