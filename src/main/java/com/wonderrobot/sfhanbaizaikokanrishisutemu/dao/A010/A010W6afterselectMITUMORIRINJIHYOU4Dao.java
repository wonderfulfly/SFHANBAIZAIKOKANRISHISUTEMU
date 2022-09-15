package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU4Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOU4Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOU4Dao
 * @version

 */

@Repository
public class A010W6afterselectMITUMORIRINJIHYOU4Dao {
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU4Mapper A010W6afterselectMITUMORIRINJIHYOU4Mapper;

   
	public List<A010W6afterselectMITUMORIRINJIHYOU4Entity> A010W6afterselectMITUMORIRINJIHYOU4 (String ROGUINID_RUUPUKAISHI_) throws Exception {

		List<A010W6afterselectMITUMORIRINJIHYOU4Entity> returnVal = A010W6afterselectMITUMORIRINJIHYOU4Mapper.A010W6afterselectMITUMORIRINJIHYOU4(ROGUINID_RUUPUKAISHI_);
		return returnVal;
	}
}