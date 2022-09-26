package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONRepeatCheckEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A003BUMONRepeatCheckMapper
 * @version

 */

public interface A003BUMONRepeatCheckMapper {
	public List<A003BUMONRepeatCheckEntity> A003BUMONRepeatCheckselectBUMON(@Param("BUMONID1")String BUMONID1);
}