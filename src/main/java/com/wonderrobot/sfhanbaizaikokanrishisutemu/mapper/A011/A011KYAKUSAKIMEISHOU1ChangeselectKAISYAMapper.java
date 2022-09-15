package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper
 * @version

 */

public interface A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper {
	public List<A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity> A011KYAKUSAKIMEISHOU1ChangeselectKAISYA(@Param("KYAKUSAKIMEISHOU")String KYAKUSAKIMEISHOU);
}