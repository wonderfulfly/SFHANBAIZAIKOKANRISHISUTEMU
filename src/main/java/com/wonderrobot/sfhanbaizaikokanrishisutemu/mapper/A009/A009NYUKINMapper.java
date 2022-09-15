package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009NYUKINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009NYUKINMapper
 * @version

 */

public interface A009NYUKINMapper {
	public List<A009NYUKINEntity> A009InitDepthZero(@Param("RYOUSHUUSHONO")String RYOUSHUUSHONO);
}