package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterselectBUHINMapper
 * @version

 */

public interface A013T7afterselectBUHINMapper {
	public List<A013T7afterselectBUHINEntity> A013T7afterselectBUHIN(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO);
}