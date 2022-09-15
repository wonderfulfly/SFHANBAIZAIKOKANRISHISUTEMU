package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009grdB8NYUKINMEISAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009grdB8NYUKINMEISAIMapper
 * @version

 */

public interface A009grdB8NYUKINMEISAIMapper {
	public List<A009grdB8NYUKINMEISAIEntity> A009InitGrid(@Param("RYOUSHUUSHONO")String RYOUSHUUSHONO);
}