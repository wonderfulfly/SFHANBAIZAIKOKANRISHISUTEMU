package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1insertBUHINMapper
 * @version

 */

public interface A011PageAfterSave1insertBUHINMapper {
	public int A011PageAfterSave1insertBUHIN(@Param("ay6_TYUMONSYO_CHUUBUNSHONO")String ay6_TYUMONSYO_CHUUBUNSHONO, @Param("ay6_TYUMONSYO_SHANAIKOUJIBANGOU")String ay6_TYUMONSYO_SHANAIKOUJIBANGOU, @Param("ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO")String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
}