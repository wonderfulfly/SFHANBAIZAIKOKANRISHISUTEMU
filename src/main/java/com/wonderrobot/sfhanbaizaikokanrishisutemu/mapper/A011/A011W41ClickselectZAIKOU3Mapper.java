package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU3Entity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011W41ClickselectZAIKOU3Mapper
 * @version

 */

public interface A011W41ClickselectZAIKOU3Mapper {
	public List<A011W41ClickselectZAIKOU3Entity> A011W41ClickselectZAIKOU3(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}