package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A006Delete19GridSaveMapper
 * @version

 */

public interface A006Delete19GridSaveMapper {
	public int A006Delete19GridSaveData(@Param("SHOUHINNO")String SHOUHINNO);
}