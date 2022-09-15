package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterSave1selectNYUKINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009PageAfterSave1selectNYUKINMapper
 * @version

 */

public interface A009PageAfterSave1selectNYUKINMapper {
	public List<A009PageAfterSave1selectNYUKINEntity> A009PageAfterSave1selectNYUKIN(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}