package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Entity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper
 * @version

 */

public interface A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper {
	public List<A013grdB16AC161ClickselectBUHINSYOUSAI1Entity> A013grdB16AC161ClickselectBUHINSYOUSAI1(@Param("ay4_BUHINSYOUSAI_CHUUBUNSHONO")String ay4_BUHINSYOUSAI_CHUUBUNSHONO, @Param("CHUUBUNSHOMEISAINO1")String CHUUBUNSHOMEISAINO1, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("HINBANNO")String HINBANNO);
}