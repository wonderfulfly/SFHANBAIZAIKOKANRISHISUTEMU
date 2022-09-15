package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18W181ClickselectBUHINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011grdB18W181ClickselectBUHINMapper
 * @version

 */

public interface A011grdB18W181ClickselectBUHINMapper {
	public List<A011grdB18W181ClickselectBUHINEntity> A011grdB18W181ClickselectBUHIN(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1, @Param("CHUUBUNSHOMEISAINO")String CHUUBUNSHOMEISAINO);
}