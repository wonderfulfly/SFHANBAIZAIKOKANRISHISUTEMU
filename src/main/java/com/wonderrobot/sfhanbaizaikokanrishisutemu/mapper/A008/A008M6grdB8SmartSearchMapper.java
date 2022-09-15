package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008M6grdB8SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A008M6grdB8SmartSearchMapper
 * @version

 */

public interface A008M6grdB8SmartSearchMapper {
	public List<A008M6grdB8SmartSearchEntity> A008M6grdB8SmartSearch(@Param("KYAKUSAKI")String KYAKUSAKI, @Param("MINYUUKIN")String MINYUUKIN, @Param("CHUUMONHIDZUKE")String CHUUMONHIDZUKE);
}