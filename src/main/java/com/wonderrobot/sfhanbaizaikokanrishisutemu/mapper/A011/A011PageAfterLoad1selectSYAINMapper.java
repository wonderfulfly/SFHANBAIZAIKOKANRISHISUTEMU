package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectSYAINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterLoad1selectSYAINMapper
 * @version

 */

public interface A011PageAfterLoad1selectSYAINMapper {
	public List<A011PageAfterLoad1selectSYAINEntity> A011PageAfterLoad1selectSYAIN(@Param("ROGUINID")String ROGUINID);
}