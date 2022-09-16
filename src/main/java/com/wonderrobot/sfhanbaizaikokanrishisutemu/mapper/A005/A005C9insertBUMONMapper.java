package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A005C9insertBUMONMapper
 * @version

 */

public interface A005C9insertBUMONMapper {
	public int A005C9insertBUMON(@Param("BUMONID")String BUMONID, @Param("BUMONMEI")String BUMONMEI);
}