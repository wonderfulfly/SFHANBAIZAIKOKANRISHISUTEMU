package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004KAISYAEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A004KAISYAMapper
 * @version

 */

public interface A004KAISYAMapper {
	public List<A004KAISYAEntity> A004InitDepthZero(@Param("KAISHAID1")String KAISHAID1);
}