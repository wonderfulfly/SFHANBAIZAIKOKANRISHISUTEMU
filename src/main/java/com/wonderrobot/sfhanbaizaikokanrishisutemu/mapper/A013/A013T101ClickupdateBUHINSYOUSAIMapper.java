package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T101ClickupdateBUHINSYOUSAIMapper
 * @version

 */

public interface A013T101ClickupdateBUHINSYOUSAIMapper {
	public int A013T101ClickupdateBUHINSYOUSAI(@Param("SEISAKUHINKUBUN")String SEISAKUHINKUBUN, @Param("HINMEI")String HINMEI, @Param("HINBANNO1")String HINBANNO1, @Param("KOSUU1")int KOSUU1, @Param("SOUKOSUU1")int SOUKOSUU1, @Param("TSUKAMATSUNYUUSAKI")String TSUKAMATSUNYUUSAKI, @Param("TANTOU")String TANTOU, @Param("TEHAISAKI")String TEHAISAKI, @Param("KOUNYUUTANKA1")double KOUNYUUTANKA1, @Param("KAHEI")String KAHEI, @Param("SHOUKEI1")double SHOUKEI1, @Param("NYUUKABI")String NYUUKABI, @Param("TEHAIBI")String TEHAIBI, @Param("KIBOUNOUKI")String KIBOUNOUKI, @Param("CHUUBUNSHONO1")String CHUUBUNSHONO1, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("HINBANNO")String HINBANNO);
}