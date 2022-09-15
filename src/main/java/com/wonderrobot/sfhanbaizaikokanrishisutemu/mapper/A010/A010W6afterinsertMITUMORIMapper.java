package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterinsertMITUMORIMapper
 * @version

 */

public interface A010W6afterinsertMITUMORIMapper {
	public int A010W6afterinsertMITUMORI(@Param("MITUMORIRINJIHYOU_MITSUMORINO")String MITUMORIRINJIHYOU_MITSUMORINO, @Param("MITUMORIRINJIHYOU_HIDZUKE")String MITUMORIRINJIHYOU_HIDZUKE, @Param("MITUMORIRINJIHYOU_KYAKUSAKI")String MITUMORIRINJIHYOU_KYAKUSAKI, @Param("MITUMORIRINJIHYOU_SAKUSEISHA")String MITUMORIRINJIHYOU_SAKUSEISHA, @Param("MITUMORIRINJIHYOU_HINMEI")String MITUMORIRINJIHYOU_HINMEI, @Param("MITUMORIRINJIHYOU_GOUKEI")double MITUMORIRINJIHYOU_GOUKEI);
}