package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterdeleteBUHINSYOUSAI1Mapper
 * @version

 */

public interface A013T7afterdeleteBUHINSYOUSAI1Mapper {
	public int A013T7afterdeleteBUHINSYOUSAI1(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KUUHAKUNODEETAWOSAKUJOSURU")String KUUHAKUNODEETAWOSAKUJOSURU);
}