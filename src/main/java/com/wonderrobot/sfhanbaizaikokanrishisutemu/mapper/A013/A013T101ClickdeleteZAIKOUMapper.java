package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T101ClickdeleteZAIKOUMapper
 * @version

 */

public interface A013T101ClickdeleteZAIKOUMapper {
	public int A013T101ClickdeleteZAIKOU(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1, @Param("CHUUBUNSHOMEISAINO1")String CHUUBUNSHOMEISAINO1);
}