package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W61ClickselectNYUKINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011W61ClickselectNYUKINMapper
 * @version

 */

public interface A011W61ClickselectNYUKINMapper {
	public List<A011W61ClickselectNYUKINEntity> A011W61ClickselectNYUKIN(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}