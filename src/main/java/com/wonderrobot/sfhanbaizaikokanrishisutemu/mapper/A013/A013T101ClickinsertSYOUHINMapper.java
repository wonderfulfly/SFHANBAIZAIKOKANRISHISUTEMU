package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T101ClickinsertSYOUHINMapper
 * @version

 */

public interface A013T101ClickinsertSYOUHINMapper {
	public int A013T101ClickinsertSYOUHIN(@Param("SHOUHINNUMBER")String SHOUHINNUMBER, @Param("ay3_BUHINSYOUSAI_HINMEI")String ay3_BUHINSYOUSAI_HINMEI, @Param("ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI")String ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, @Param("ay3_BUHINSYOUSAI_ZAISHITSU")String ay3_BUHINSYOUSAI_ZAISHITSU, @Param("ay3_BUHINSYOUSAI_KOUNYUUTANKA")double ay3_BUHINSYOUSAI_KOUNYUUTANKA, @Param("ay3_BUHINSYOUSAI_SOUKOSUU")int ay3_BUHINSYOUSAI_SOUKOSUU, @Param("ay3_BUHINSYOUSAI_NYUUKABI")String ay3_BUHINSYOUSAI_NYUUKABI);
}