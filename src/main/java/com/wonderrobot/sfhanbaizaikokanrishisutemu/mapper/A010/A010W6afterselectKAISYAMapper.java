package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectKAISYAEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterselectKAISYAMapper
 * @version

 */

public interface A010W6afterselectKAISYAMapper {
	public List<A010W6afterselectKAISYAEntity> A010W6afterselectKAISYA(@Param("MITUMORIRINJIHYOU_KYAKUSAKI")String MITUMORIRINJIHYOU_KYAKUSAKI);
}