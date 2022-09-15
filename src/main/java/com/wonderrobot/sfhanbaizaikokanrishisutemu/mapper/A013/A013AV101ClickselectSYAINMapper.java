package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectSYAINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013AV101ClickselectSYAINMapper
 * @version

 */

public interface A013AV101ClickselectSYAINMapper {
	public List<A013AV101ClickselectSYAINEntity> A013AV101ClickselectSYAIN(@Param("ROGUINID")String ROGUINID);
}