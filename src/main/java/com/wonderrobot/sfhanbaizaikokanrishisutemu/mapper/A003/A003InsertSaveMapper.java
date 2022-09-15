package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A003InsertSaveMapper
 * @version

 */

public interface A003InsertSaveMapper {
	public int A003InsertSaveData(@Param("BUMONID")String BUMONID, @Param("BUMONMEI")String BUMONMEI);
}