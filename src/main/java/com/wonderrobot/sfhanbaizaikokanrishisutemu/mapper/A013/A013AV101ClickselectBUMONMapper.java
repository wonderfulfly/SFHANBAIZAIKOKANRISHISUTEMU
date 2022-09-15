package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectBUMONEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013AV101ClickselectBUMONMapper
 * @version

 */

public interface A013AV101ClickselectBUMONMapper {
	public List<A013AV101ClickselectBUMONEntity> A013AV101ClickselectBUMON(@Param("ay1_SYAIN_YUUZAAKENGEN")String ay1_SYAIN_YUUZAAKENGEN);
}