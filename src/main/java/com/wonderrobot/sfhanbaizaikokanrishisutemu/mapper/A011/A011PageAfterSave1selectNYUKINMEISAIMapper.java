package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectNYUKINMEISAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1selectNYUKINMEISAIMapper
 * @version

 */

public interface A011PageAfterSave1selectNYUKINMEISAIMapper {
	public List<A011PageAfterSave1selectNYUKINMEISAIEntity> A011PageAfterSave1selectNYUKINMEISAI(@Param("ay2_TYUMONSYO_RESHIITONO")String ay2_TYUMONSYO_RESHIITONO);
}