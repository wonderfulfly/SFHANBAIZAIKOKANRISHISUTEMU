package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013UpdateSaveMapper
 * @version

 */

public interface A013UpdateSaveMapper {
	public int A013UpdateSaveData(@Param("TOKUISAKI")String TOKUISAKI, @Param("MAISUU")String MAISUU, @Param("ASENBURIRAIN")String ASENBURIRAIN, @Param("KAKUTEIKUBUN")String KAKUTEIKUBUN, @Param("KIKAIMEISHOU")String KIKAIMEISHOU, @Param("BUHINMEISHOU")String BUHINMEISHOU, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("SEISAKUSUU")String SEISAKUSUU, @Param("TANTOUSHA")String TANTOUSHA, @Param("KOUJIKANRIBANGOU")String KOUJIKANRIBANGOU, @Param("SHUKKANO")String SHUKKANO, @Param("JPYGOUKEIKINGAKU")String JPYGOUKEIKINGAKU, @Param("RMBGOUKEIKINGAKU")String RMBGOUKEIKINGAKU, @Param("USDGOUKEIKINGAKU")String USDGOUKEIKINGAKU, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO, @Param("CHUUBUNSHONO1")String CHUUBUNSHONO1, @Param("CHUUBUNSHOMEISAINO1")String CHUUBUNSHOMEISAINO1, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1);
}