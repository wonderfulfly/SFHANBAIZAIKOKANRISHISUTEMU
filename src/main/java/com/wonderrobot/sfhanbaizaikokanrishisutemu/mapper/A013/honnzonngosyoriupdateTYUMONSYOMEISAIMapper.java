package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: honnzonngosyoriupdateTYUMONSYOMEISAIMapper
 * @version

 */

public interface honnzonngosyoriupdateTYUMONSYOMEISAIMapper {
	public int honnzonngosyoriupdateTYUMONSYOMEISAI(@Param("JPYGOUKEI1")double JPYGOUKEI1, @Param("RMBGOUKEI1")double RMBGOUKEI1, @Param("USDGOUKEI1")double USDGOUKEI1, @Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO);
}