package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectTYUMONSYOEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterLoad1selectTYUMONSYOMapper
 * @version

 */

public interface A011PageAfterLoad1selectTYUMONSYOMapper {
	public List<A011PageAfterLoad1selectTYUMONSYOEntity> A011PageAfterLoad1selectTYUMONSYO(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}