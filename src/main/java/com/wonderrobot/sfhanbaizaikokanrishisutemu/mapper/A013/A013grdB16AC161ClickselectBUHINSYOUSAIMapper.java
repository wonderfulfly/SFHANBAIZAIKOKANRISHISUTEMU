package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013grdB16AC161ClickselectBUHINSYOUSAIMapper
 * @version

 */

public interface A013grdB16AC161ClickselectBUHINSYOUSAIMapper {
	public List<A013grdB16AC161ClickselectBUHINSYOUSAIEntity> A013grdB16AC161ClickselectBUHINSYOUSAI(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1, @Param("CHUUBUNSHOMEISAINO1")String CHUUBUNSHOMEISAINO1, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("HINBANNO")String HINBANNO);
}