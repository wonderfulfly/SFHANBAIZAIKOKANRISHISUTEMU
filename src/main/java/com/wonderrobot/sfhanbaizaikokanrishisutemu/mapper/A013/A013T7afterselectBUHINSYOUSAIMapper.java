package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterselectBUHINSYOUSAIMapper
 * @version

 */

public interface A013T7afterselectBUHINSYOUSAIMapper {
	public List<Double> A013T7afterselectBUHINSYOUSAI(@Param("ay9_BUHINSYOUSAIRINJIHYOU_HINMEI")String ay9_BUHINSYOUSAIRINJIHYOU_HINMEI);
}