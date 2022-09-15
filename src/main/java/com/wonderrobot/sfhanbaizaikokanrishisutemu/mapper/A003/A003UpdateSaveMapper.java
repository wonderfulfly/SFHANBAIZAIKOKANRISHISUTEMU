package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A003UpdateSaveMapper
 * @version

 */

public interface A003UpdateSaveMapper {
	public int A003UpdateSaveData(@Param("BUMONID")String BUMONID, @Param("BUMONMEI")String BUMONMEI, @Param("BUMONID1")String BUMONID1);
}