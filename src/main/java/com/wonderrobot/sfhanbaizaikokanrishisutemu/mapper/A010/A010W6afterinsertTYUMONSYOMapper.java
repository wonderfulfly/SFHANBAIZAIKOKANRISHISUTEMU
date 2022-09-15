package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterinsertTYUMONSYOMapper
 * @version

 */

public interface A010W6afterinsertTYUMONSYOMapper {
	public int A010W6afterinsertTYUMONSYO(@Param("CHUUBUNSHONOautoNum")String CHUUBUNSHONOautoNum, @Param("MITUMORIRINJIHYOU_MITSUMORINO")String MITUMORIRINJIHYOU_MITSUMORINO, @Param("MITUMORIRINJIHYOU_HIDZUKE")String MITUMORIRINJIHYOU_HIDZUKE, @Param("KAISHAID2")String KAISHAID2, @Param("JPY1")double JPY1, @Param("MITUMORIRINJIHYOU_SAKUSEISHA")String MITUMORIRINJIHYOU_SAKUSEISHA, @Param("MITUMORIRINJIHYOU_HINMEI")String MITUMORIRINJIHYOU_HINMEI, @Param("MITUMORIRINJIHYOU_GOUKEI")double MITUMORIRINJIHYOU_GOUKEI, @Param("MITUMORIRINJIHYOU_KYAKUSAKITANTOU")String MITUMORIRINJIHYOU_KYAKUSAKITANTOU, @Param("RMB1")double RMB1, @Param("USD1")double USD1);
}