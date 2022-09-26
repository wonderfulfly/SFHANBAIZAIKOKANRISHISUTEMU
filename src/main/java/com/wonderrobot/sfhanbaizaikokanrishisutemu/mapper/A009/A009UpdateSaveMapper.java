package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009UpdateSaveMapper
 * @version

 */

public interface A009UpdateSaveMapper {
	public int A009UpdateSaveData(@Param("KYAKUSAKIID")String KYAKUSAKIID, @Param("TANTOUSHAID")String TANTOUSHAID, @Param("RESHIITONO")String RESHIITONO, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("KANTOKU")String KANTOKU, @Param("CHUUMONHIDZUKE")String CHUUMONHIDZUKE, @Param("NYUUKINKINGAKU")String NYUUKINKINGAKU, @Param("JISSAINYUUKINJOUTAI")String JISSAINYUUKINJOUTAI, @Param("RESHIITONO1")String RESHIITONO1);
}