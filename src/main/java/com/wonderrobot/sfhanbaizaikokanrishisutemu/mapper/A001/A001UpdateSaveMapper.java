package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A001UpdateSaveMapper
 * @version

 */

public interface A001UpdateSaveMapper {
	public int A001UpdateSaveData(@Param("SHAINID")String SHAINID, @Param("SHAINMEI")String SHAINMEI, @Param("DENWABANGOU")String DENWABANGOU, @Param("KEITAIBANGOU")String KEITAIBANGOU, @Param("EMAIL")String EMAIL, @Param("LINE")String LINE, @Param("YUUZAAKENGEN")String YUUZAAKENGEN, @Param("YUUKOUKUBUN")String YUUKOUKUBUN, @Param("ROGUINID")String ROGUINID, @Param("PASUWAADO")String PASUWAADO, @Param("SHAINID1")String SHAINID1, @Param("ROGUINID1")String ROGUINID1);
}