package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008I6grdB8SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A008I6grdB8SmartSearchMapper
 * @version

 */

public interface A008I6grdB8SmartSearchMapper {
	public List<A008I6grdB8SmartSearchEntity> A008I6grdB8SmartSearch(@Param("KYAKUSAKI")String KYAKUSAKI, @Param("CHUUMONHIDZUKE")String CHUUMONHIDZUKE);
}