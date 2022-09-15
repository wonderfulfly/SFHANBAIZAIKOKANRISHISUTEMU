package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T101ClickupdateBUHINMapper
 * @version

 */

public interface A013T101ClickupdateBUHINMapper {
	public int A013T101ClickupdateBUHIN(@Param("ay1_BUHINSYOUSAI_CHUUBUNSHONO")String ay1_BUHINSYOUSAI_CHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO);
}