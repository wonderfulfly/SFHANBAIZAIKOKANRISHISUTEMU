package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterinsertTYUMONSYOMEISAIMapper
 * @version

 */

public interface A010W6afterinsertTYUMONSYOMEISAIMapper {
	public int A010W6afterinsertTYUMONSYOMEISAI(@Param("CHUUBUNSHONOautoNum")String CHUUBUNSHONOautoNum, @Param("CHUUBUNSHOMEISAINOautoNum")String CHUUBUNSHOMEISAINOautoNum, @Param("MITUMORIRINJIHYOU_KOUMOKU")String MITUMORIRINJIHYOU_KOUMOKU, @Param("MITUMORIRINJIHYOU_SUURYOU")int MITUMORIRINJIHYOU_SUURYOU, @Param("MITUMORIRINJIHYOU_PRICE")double MITUMORIRINJIHYOU_PRICE, @Param("MITUMORIRINJIHYOU_GOLD")double MITUMORIRINJIHYOU_GOLD, @Param("MITUMORIRINJIHYOU_KAHEI")String MITUMORIRINJIHYOU_KAHEI);
}