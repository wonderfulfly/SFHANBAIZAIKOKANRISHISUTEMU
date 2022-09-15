package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T101ClickselectBUHINSYOUSAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T101ClickselectBUHINSYOUSAIMapper
 * @version

 */

public interface A013T101ClickselectBUHINSYOUSAIMapper {
	public List<A013T101ClickselectBUHINSYOUSAIEntity> A013T101ClickselectBUHINSYOUSAI(@Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1);
}