package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: honnzonngosyoriupdateBUHINMapper
 * @version

 */

public interface honnzonngosyoriupdateBUHINMapper {
	public int honnzonngosyoriupdateBUHIN(@Param("JPYGOUKEI2")double JPYGOUKEI2, @Param("RMBGOUKEI2")double RMBGOUKEI2, @Param("USDGOUKEI2")double USDGOUKEI2, @Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1);
}