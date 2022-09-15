package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008Q2I00012PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A008Q2I00012PrintMapper
 * @version

 */

public interface A008Q2I00012PrintMapper {
	public List<A008Q2I00012PrintEntity> A008Q2I00012Print(@Param("KYAKUSAKI")String KYAKUSAKI, @Param("CHUUMONHIDZUKE")String CHUUMONHIDZUKE);
}