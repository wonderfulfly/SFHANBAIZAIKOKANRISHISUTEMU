package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterupdateBUHINSYOUSAIMapper
 * @version

 */

public interface A013T7afterupdateBUHINSYOUSAIMapper {
	public int A013T7afterupdateBUHINSYOUSAI(@Param("KOUNYUUTANKA_SUM")double KOUNYUUTANKA_SUM, @Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU")String KOUJIKANRIBANGOU, @Param("ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO")String ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO);
}