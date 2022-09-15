package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013Delete99GridSaveMapper
 * @version

 */

public interface A013Delete99GridSaveMapper {
	public int A013Delete99GridSaveData(@Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO, @Param("HINBANNO")String HINBANNO);
}