package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013grdB16AC161ClickinsertSYOUHINMapper
 * @version

 */

public interface A013grdB16AC161ClickinsertSYOUHINMapper {
	public int A013grdB16AC161ClickinsertSYOUHIN(@Param("KETSUGOUMOJI2")String KETSUGOUMOJI2, @Param("ay6_BUHINSYOUSAI_HINMEI")String ay6_BUHINSYOUSAI_HINMEI, @Param("ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI")String ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, @Param("ay6_BUHINSYOUSAI_ZAISHITSU")String ay6_BUHINSYOUSAI_ZAISHITSU, @Param("ay6_BUHINSYOUSAI_KOUNYUUTANKA")double ay6_BUHINSYOUSAI_KOUNYUUTANKA, @Param("ay6_BUHINSYOUSAI_SOUKOSUU")int ay6_BUHINSYOUSAI_SOUKOSUU, @Param("ay6_BUHINSYOUSAI_NYUUKABI")String ay6_BUHINSYOUSAI_NYUUKABI);
}