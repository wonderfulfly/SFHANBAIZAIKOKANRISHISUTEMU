package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterselectMITUMORIRINJIHYOU2Mapper
 * @version

 */

public interface A010W6afterselectMITUMORIRINJIHYOU2Mapper {
	public List<Double> A010W6afterselectMITUMORIRINJIHYOU2(@Param("ROGUINID")String ROGUINID);
}