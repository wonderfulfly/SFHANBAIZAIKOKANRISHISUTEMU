package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011W41ClickupdateSYOUHINMapper
 * @version

 */

public interface A011W41ClickupdateSYOUHINMapper {
	public int A011W41ClickupdateSYOUHIN(@Param("SYOUHIN_ZAIKOSUURYOU")int SYOUHIN_ZAIKOSUURYOU, @Param("ay1_ZAIKOU_SHOUHINNO")String ay1_ZAIKOU_SHOUHINNO);
}