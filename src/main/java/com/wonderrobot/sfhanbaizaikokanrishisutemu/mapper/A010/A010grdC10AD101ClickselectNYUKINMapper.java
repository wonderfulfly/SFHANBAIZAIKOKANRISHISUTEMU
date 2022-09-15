package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010grdC10AD101ClickselectNYUKINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010grdC10AD101ClickselectNYUKINMapper
 * @version

 */

public interface A010grdC10AD101ClickselectNYUKINMapper {
	public List<A010grdC10AD101ClickselectNYUKINEntity> A010grdC10AD101ClickselectNYUKIN(@Param("CHUUBUNSHONO")String CHUUBUNSHONO);
}