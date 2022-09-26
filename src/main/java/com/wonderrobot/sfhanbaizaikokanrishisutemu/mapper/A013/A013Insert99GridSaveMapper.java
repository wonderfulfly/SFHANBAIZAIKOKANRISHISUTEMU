package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013Insert99GridSaveMapper
 * @version

 */

public interface A013Insert99GridSaveMapper {
	public int A013Insert99GridSaveData(@Param("SEISAKUHINKUBUN")String SEISAKUHINKUBUN, @Param("HINBANNO1")String HINBANNO1, @Param("HINMEI")String HINMEI, @Param("KOSUU")String KOSUU, @Param("SOUKOSUU")String SOUKOSUU, @Param("TSUKAMATSUNYUUSAKI")String TSUKAMATSUNYUUSAKI, @Param("KIBOUNOUKI")String KIBOUNOUKI, @Param("TANTOU")String TANTOU, @Param("TEHAISAKI")String TEHAISAKI, @Param("KOUNYUUTANKA")String KOUNYUUTANKA, @Param("KAHEI")String KAHEI, @Param("TEHAIBI")String TEHAIBI, @Param("NYUUKABI")String NYUUKABI, @Param("SHOUKEI")String SHOUKEI, @Param("KAKOTANKA")String KAKOTANKA, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("KIBOUTANKA")String KIBOUTANKA, @Param("NYUUKAYOTEIBI")String NYUUKAYOTEIBI, @Param("HINBANNO")String HINBANNO, @Param("KAKUTEIKUBUN")String KAKUTEIKUBUN, @Param("KOUJIKANRIBANGOU")String KOUJIKANRIBANGOU);
}