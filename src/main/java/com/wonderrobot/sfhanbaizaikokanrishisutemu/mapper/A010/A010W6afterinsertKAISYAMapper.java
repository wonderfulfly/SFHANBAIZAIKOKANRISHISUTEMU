package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterinsertKAISYAMapper
 * @version

 */

public interface A010W6afterinsertKAISYAMapper {
	public int A010W6afterinsertKAISYA(@Param("KAISHAIDautoNum")String KAISHAIDautoNum, @Param("MITUMORIRINJIHYOU_KYAKUSAKI")String MITUMORIRINJIHYOU_KYAKUSAKI);
}