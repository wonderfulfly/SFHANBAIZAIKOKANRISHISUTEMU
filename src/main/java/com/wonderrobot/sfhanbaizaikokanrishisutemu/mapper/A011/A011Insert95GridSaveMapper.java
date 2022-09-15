package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011Insert95GridSaveMapper
 * @version

 */

public interface A011Insert95GridSaveMapper {
	public int A011Insert95GridSaveData(@Param("KUBUN")String KUBUN, @Param("KOUMOKU")String KOUMOKU, @Param("SUURYOU")String SUURYOU, @Param("HANBAITANKA")String HANBAITANKA, @Param("KAHEI")String KAHEI, @Param("HANBAIKINGAKU")String HANBAIKINGAKU, @Param("TSUKAMATSUNYUUKINGAKUJPY")String TSUKAMATSUNYUUKINGAKUJPY, @Param("TSUKAMATSUNYUUKINGAKURMB")String TSUKAMATSUNYUUKINGAKURMB, @Param("TSUKAMATSUNYUUKINGAKUUSD")String TSUKAMATSUNYUUKINGAKUUSD, @Param("SHUKKOFURAGU")String SHUKKOFURAGU, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO);
}