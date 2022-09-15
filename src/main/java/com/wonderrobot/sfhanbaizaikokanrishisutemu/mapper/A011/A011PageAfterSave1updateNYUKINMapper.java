package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1updateNYUKINMapper
 * @version

 */

public interface A011PageAfterSave1updateNYUKINMapper {
	public int A011PageAfterSave1updateNYUKIN(@Param("JPYGOUKEI")double JPYGOUKEI, @Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}