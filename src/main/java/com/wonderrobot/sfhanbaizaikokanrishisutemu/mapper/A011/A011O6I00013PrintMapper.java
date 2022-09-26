package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011O6I00013PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A011O6I00013PrintMapper
 * @version

 */

public interface A011O6I00013PrintMapper {
	public List<A011O6I00013PrintEntity> A011O6I00013Print(@Param("KYAKUSAKIMEISHOU")String KYAKUSAKIMEISHOU, @Param("CHUUMONHIDZUKE1")String CHUUMONHIDZUKE1);
}