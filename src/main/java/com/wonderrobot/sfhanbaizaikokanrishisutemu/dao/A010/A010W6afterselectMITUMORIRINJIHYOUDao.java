package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOUDao
 * @version

 */

@Repository
public class A010W6afterselectMITUMORIRINJIHYOUDao {
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOUMapper A010W6afterselectMITUMORIRINJIHYOUMapper;

   
	public List<Double> A010W6afterselectMITUMORIRINJIHYOU (String ROGUINID) throws Exception {

		List<Double> returnVal = A010W6afterselectMITUMORIRINJIHYOUMapper.A010W6afterselectMITUMORIRINJIHYOU(ROGUINID);
		return returnVal;
	}
}