package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectBUMONEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterLoad1selectBUMONMapper
 * @version

 */

public interface A011PageAfterLoad1selectBUMONMapper {
	public List<A011PageAfterLoad1selectBUMONEntity> A011PageAfterLoad1selectBUMON(@Param("SYAIN_YUUZAAKENGEN")String SYAIN_YUUZAAKENGEN);
}