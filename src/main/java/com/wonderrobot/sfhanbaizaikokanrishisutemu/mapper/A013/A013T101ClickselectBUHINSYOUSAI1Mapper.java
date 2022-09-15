package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T101ClickselectBUHINSYOUSAI1Entity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T101ClickselectBUHINSYOUSAI1Mapper
 * @version

 */

public interface A013T101ClickselectBUHINSYOUSAI1Mapper {
	public List<A013T101ClickselectBUHINSYOUSAI1Entity> A013T101ClickselectBUHINSYOUSAI1(@Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO);
}