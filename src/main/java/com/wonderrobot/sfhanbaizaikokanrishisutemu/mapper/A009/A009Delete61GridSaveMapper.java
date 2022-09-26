package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009Delete61GridSaveMapper
 * @version

 */

public interface A009Delete61GridSaveMapper {
	public int A009Delete61GridSaveData(@Param("RESHIITONO")String RESHIITONO, @Param("RESHIITOMEISAINO")String RESHIITOMEISAINO);
}