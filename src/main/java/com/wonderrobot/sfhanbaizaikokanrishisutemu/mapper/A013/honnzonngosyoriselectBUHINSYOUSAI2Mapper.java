package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: honnzonngosyoriselectBUHINSYOUSAI2Mapper
 * @version

 */

public interface honnzonngosyoriselectBUHINSYOUSAI2Mapper {
	public List<Double> honnzonngosyoriselectBUHINSYOUSAI2(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1);
}