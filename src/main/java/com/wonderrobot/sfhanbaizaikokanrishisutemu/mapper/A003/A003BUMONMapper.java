package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A003BUMONMapper
 * @version

 */

public interface A003BUMONMapper {
	public List<A003BUMONEntity> A003InitDepthZero(@Param("BUMONID1")String BUMONID1);
}