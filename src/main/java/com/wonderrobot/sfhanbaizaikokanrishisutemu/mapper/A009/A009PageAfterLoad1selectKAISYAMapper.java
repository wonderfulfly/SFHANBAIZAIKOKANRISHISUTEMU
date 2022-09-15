package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterLoad1selectKAISYAEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009PageAfterLoad1selectKAISYAMapper
 * @version

 */

public interface A009PageAfterLoad1selectKAISYAMapper {
	public List<A009PageAfterLoad1selectKAISYAEntity> A009PageAfterLoad1selectKAISYA(@Param("KYAKUSAKI")String KYAKUSAKI);
}