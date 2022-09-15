package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011Update95GridSaveMapper
 * @version

 */

public interface A011Update95GridSaveMapper {
	public int A011Update95GridSaveData(@Param("KUBUN")String KUBUN, @Param("KOUMOKU")String KOUMOKU, @Param("SUURYOU")String SUURYOU, @Param("HANBAITANKA")String HANBAITANKA, @Param("KAHEI")String KAHEI, @Param("HANBAIKINGAKU")String HANBAIKINGAKU, @Param("TSUKAMATSUNYUUKINGAKUJPY")String TSUKAMATSUNYUUKINGAKUJPY, @Param("TSUKAMATSUNYUUKINGAKURMB")String TSUKAMATSUNYUUKINGAKURMB, @Param("TSUKAMATSUNYUUKINGAKUUSD")String TSUKAMATSUNYUUKINGAKUUSD, @Param("SHUKKOFURAGU")String SHUKKOFURAGU, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO, @Param("CHUUBUNSHONO1")String CHUUBUNSHONO1, @Param("CHUUBUNSHOMEISAINO1")String CHUUBUNSHOMEISAINO1);
}