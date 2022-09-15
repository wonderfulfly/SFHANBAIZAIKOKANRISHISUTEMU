package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterselectMITUMORIRINJIHYOUMapper
 * @version

 */

public interface A010W6afterselectMITUMORIRINJIHYOUMapper {
	public List<Double> A010W6afterselectMITUMORIRINJIHYOU(@Param("ROGUINID")String ROGUINID);
}