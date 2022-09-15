package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007Y61ClickselectZAIKOUEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A007Y61ClickselectZAIKOUMapper
 * @version

 */

public interface A007Y61ClickselectZAIKOUMapper {
	public List<A007Y61ClickselectZAIKOUEntity> A007Y61ClickselectZAIKOU(@Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("BUHINMEI")String BUHINMEI, @Param("ZAIKONO")String ZAIKONO, @Param("SHANAIKOUJIBANGOU")String SHANAIKOUJIBANGOU);
}