package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYOEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1selectTYUMONSYOMapper
 * @version

 */

public interface A011PageAfterSave1selectTYUMONSYOMapper {
	public List<A011PageAfterSave1selectTYUMONSYOEntity> A011PageAfterSave1selectTYUMONSYO(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}