package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterdeleteMITUMORIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterdeleteMITUMORIRINJIHYOUDao
 * @version

 */

@Repository
public class A010W6afterdeleteMITUMORIRINJIHYOUDao {
	@Autowired
	private A010W6afterdeleteMITUMORIRINJIHYOUMapper A010W6afterdeleteMITUMORIRINJIHYOUMapper;

   
	public int A010W6afterdeleteMITUMORIRINJIHYOU (String ROGUINIDNODEETAWOSAKUJOSURU) throws Exception {

		int returnVal = A010W6afterdeleteMITUMORIRINJIHYOUMapper.A010W6afterdeleteMITUMORIRINJIHYOU(ROGUINIDNODEETAWOSAKUJOSURU);
		return returnVal;
	}
}