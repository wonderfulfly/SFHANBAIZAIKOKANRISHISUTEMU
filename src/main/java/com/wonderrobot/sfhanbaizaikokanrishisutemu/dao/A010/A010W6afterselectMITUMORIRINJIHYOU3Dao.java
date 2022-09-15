package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU3Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOU3Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOU3Dao
 * @version

 */

@Repository
public class A010W6afterselectMITUMORIRINJIHYOU3Dao {
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU3Mapper A010W6afterselectMITUMORIRINJIHYOU3Mapper;

   
	public List<A010W6afterselectMITUMORIRINJIHYOU3Entity> A010W6afterselectMITUMORIRINJIHYOU3 (String ROGUINID_RUUPUKAISHI_) throws Exception {

		List<A010W6afterselectMITUMORIRINJIHYOU3Entity> returnVal = A010W6afterselectMITUMORIRINJIHYOU3Mapper.A010W6afterselectMITUMORIRINJIHYOU3(ROGUINID_RUUPUKAISHI_);
		return returnVal;
	}
}