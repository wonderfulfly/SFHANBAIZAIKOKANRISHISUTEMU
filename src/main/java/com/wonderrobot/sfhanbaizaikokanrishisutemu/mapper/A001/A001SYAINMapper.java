package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001SYAINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A001SYAINMapper
 * @version

 */

public interface A001SYAINMapper {
	public List<A001SYAINEntity> A001InitDepthZero(@Param("SHAINID1")String SHAINID1, @Param("ROGUINID1")String ROGUINID1);
}