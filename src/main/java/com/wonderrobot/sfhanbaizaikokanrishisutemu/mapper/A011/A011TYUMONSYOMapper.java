package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011TYUMONSYOMapper
 * @version

 */

public interface A011TYUMONSYOMapper {
	public List<A011TYUMONSYOEntity> A011InitDepthZero(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}