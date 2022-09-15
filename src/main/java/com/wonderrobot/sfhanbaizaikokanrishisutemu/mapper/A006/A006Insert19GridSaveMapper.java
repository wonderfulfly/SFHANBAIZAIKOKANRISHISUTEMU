package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A006Insert19GridSaveMapper
 * @version

 */

public interface A006Insert19GridSaveMapper {
	public int A006Insert19GridSaveData(@Param("SHOUHINMEISHOU")String SHOUHINMEISHOU, @Param("ZAISHITSU")String ZAISHITSU, @Param("TSUKAMATSUNYUUSAKI")String TSUKAMATSUNYUUSAKI, @Param("NYUUKAHIDZUKE")String NYUUKAHIDZUKE, @Param("PRICE")String PRICE, @Param("ZAIKOSUURYOU")String ZAIKOSUURYOU, @Param("SHOUHINNO")String SHOUHINNO);
}