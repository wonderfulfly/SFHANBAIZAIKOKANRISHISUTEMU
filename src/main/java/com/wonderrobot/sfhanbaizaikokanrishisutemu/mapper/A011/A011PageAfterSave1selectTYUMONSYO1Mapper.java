package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYO1Entity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1selectTYUMONSYO1Mapper
 * @version

 */

public interface A011PageAfterSave1selectTYUMONSYO1Mapper {
	public List<A011PageAfterSave1selectTYUMONSYO1Entity> A011PageAfterSave1selectTYUMONSYO1(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}