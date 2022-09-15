package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011W41ClickinsertZAIKOUMapper
 * @version

 */

public interface A011W41ClickinsertZAIKOUMapper {
	public int A011W41ClickinsertZAIKOU(@Param("ay1_ZAIKOU_SHOUHINMEISHOU")String ay1_ZAIKOU_SHOUHINMEISHOU, @Param("KYOU")String KYOU, @Param("ay1_ZAIKOU_CHUUBUNSHOMEISAINO")String ay1_ZAIKOU_CHUUBUNSHOMEISAINO, @Param("ay1_ZAIKOU_KOUJIKANRIBANGOU")String ay1_ZAIKOU_KOUJIKANRIBANGOU, @Param("ay1_ZAIKOU_TSUKAMATSUNYUUSAKI")String ay1_ZAIKOU_TSUKAMATSUNYUUSAKI, @Param("SHOUKEI")double SHOUKEI, @Param("SHUKKANO1")String SHUKKANO1, @Param("ay1_ZAIKOU_SUURYOU")int ay1_ZAIKOU_SUURYOU, @Param("ZAIKONOautoNum")String ZAIKONOautoNum, @Param("ay1_ZAIKOU_PRICE")double ay1_ZAIKOU_PRICE, @Param("ay1_ZAIKOU_HINBANNO")String ay1_ZAIKOU_HINBANNO);
}