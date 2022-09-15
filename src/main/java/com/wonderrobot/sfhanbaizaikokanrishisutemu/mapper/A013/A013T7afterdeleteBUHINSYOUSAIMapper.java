package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterdeleteBUHINSYOUSAIMapper
 * @version

 */

public interface A013T7afterdeleteBUHINSYOUSAIMapper {
	public int A013T7afterdeleteBUHINSYOUSAI(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO);
}