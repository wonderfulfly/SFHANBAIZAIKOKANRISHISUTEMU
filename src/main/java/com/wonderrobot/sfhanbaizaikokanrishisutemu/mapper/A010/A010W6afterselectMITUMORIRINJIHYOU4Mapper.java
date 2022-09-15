package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU4Entity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterselectMITUMORIRINJIHYOU4Mapper
 * @version

 */

public interface A010W6afterselectMITUMORIRINJIHYOU4Mapper {
	public List<A010W6afterselectMITUMORIRINJIHYOU4Entity> A010W6afterselectMITUMORIRINJIHYOU4(@Param("ROGUINID_RUUPUKAISHI_")String ROGUINID_RUUPUKAISHI_);
}