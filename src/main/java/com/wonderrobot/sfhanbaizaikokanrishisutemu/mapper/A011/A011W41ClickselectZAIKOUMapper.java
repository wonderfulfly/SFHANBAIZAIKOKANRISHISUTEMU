package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOUEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011W41ClickselectZAIKOUMapper
 * @version

 */

public interface A011W41ClickselectZAIKOUMapper {
	public List<A011W41ClickselectZAIKOUEntity> A011W41ClickselectZAIKOU(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}