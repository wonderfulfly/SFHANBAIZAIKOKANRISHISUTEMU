package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU5Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectMITUMORIRINJIHYOU5Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectMITUMORIRINJIHYOU5Dao
 * @version

 */

@Repository
public class A010W6afterselectMITUMORIRINJIHYOU5Dao {
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU5Mapper A010W6afterselectMITUMORIRINJIHYOU5Mapper;

   
	public List<A010W6afterselectMITUMORIRINJIHYOU5Entity> A010W6afterselectMITUMORIRINJIHYOU5 (String MITUMORIRINJIHYOU_MITSUMORINO, String ROGUINID_RUUPUKAISHI_) throws Exception {

		List<A010W6afterselectMITUMORIRINJIHYOU5Entity> returnVal = A010W6afterselectMITUMORIRINJIHYOU5Mapper.A010W6afterselectMITUMORIRINJIHYOU5(MITUMORIRINJIHYOU_MITSUMORINO,ROGUINID_RUUPUKAISHI_);
		return returnVal;
	}
}