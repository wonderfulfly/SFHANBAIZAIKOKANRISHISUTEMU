package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011Delete95GridSaveMapper
 * @version

 */

public interface A011Delete95GridSaveMapper {
	public int A011Delete95GridSaveData(@Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO);
}