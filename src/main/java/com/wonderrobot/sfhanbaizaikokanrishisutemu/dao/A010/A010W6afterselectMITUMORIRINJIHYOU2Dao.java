package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOU2Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOU2Dao
 * @version

 */

@Repository
public class A010W6afterselectMITUMORIRINJIHYOU2Dao {
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU2Mapper A010W6afterselectMITUMORIRINJIHYOU2Mapper;

   
	public List<Double> A010W6afterselectMITUMORIRINJIHYOU2 (String ROGUINID) throws Exception {

		List<Double> returnVal = A010W6afterselectMITUMORIRINJIHYOU2Mapper.A010W6afterselectMITUMORIRINJIHYOU2(ROGUINID);
		return returnVal;
	}
}