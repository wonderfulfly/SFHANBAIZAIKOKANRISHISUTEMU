package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1updateKAISYAMapper
 * @version

 */

public interface A011PageAfterSave1updateKAISYAMapper {
	public int A011PageAfterSave1updateKAISYA(@Param("ADORESU1")String ADORESU1, @Param("DENWABANGOU1")String DENWABANGOU1, @Param("KYAKUSAKIMEISHOU")String KYAKUSAKIMEISHOU);
}