package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectSYOUHINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011W41ClickselectSYOUHINMapper
 * @version

 */

public interface A011W41ClickselectSYOUHINMapper {
	public List<A011W41ClickselectSYOUHINEntity> A011W41ClickselectSYOUHIN(@Param("ay1_ZAIKOU_SHOUHINNO")String ay1_ZAIKOU_SHOUHINNO);
}