package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectSYAINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterselectSYAINMapper
 * @version

 */

public interface A013T7afterselectSYAINMapper {
	public List<A013T7afterselectSYAINEntity> A013T7afterselectSYAIN(@Param("ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA")String ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA);
}