package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009InsertSaveMapper
 * @version

 */

public interface A009InsertSaveMapper {
	public int A009InsertSaveData(@Param("KYAKUSAKIID")String KYAKUSAKIID, @Param("TANTOUSHAID")String TANTOUSHAID, @Param("RESHIITONO")String RESHIITONO, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("KANTOKU")String KANTOKU, @Param("CHUUMONHIDZUKE")String CHUUMONHIDZUKE, @Param("NYUUKINKINGAKU")String NYUUKINKINGAKU, @Param("JISSAINYUUKINJOUTAI")String JISSAINYUUKINJOUTAI);
}