package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013InsertSaveMapper
 * @version

 */

public interface A013InsertSaveMapper {
	public int A013InsertSaveData(@Param("TOKUISAKI")String TOKUISAKI, @Param("MAISUU")String MAISUU, @Param("ASENBURIRAIN")String ASENBURIRAIN, @Param("KAKUTEIKUBUN")String KAKUTEIKUBUN, @Param("KIKAIMEISHOU")String KIKAIMEISHOU, @Param("BUHINMEISHOU")String BUHINMEISHOU, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("SEISAKUSUU")String SEISAKUSUU, @Param("TANTOUSHA")String TANTOUSHA, @Param("KOUJIKANRIBANGOU")String KOUJIKANRIBANGOU, @Param("SHUKKANO")String SHUKKANO, @Param("JPYGOUKEIKINGAKU")String JPYGOUKEIKINGAKU, @Param("RMBGOUKEIKINGAKU")String RMBGOUKEIKINGAKU, @Param("USDGOUKEIKINGAKU")String USDGOUKEIKINGAKU, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO);
}