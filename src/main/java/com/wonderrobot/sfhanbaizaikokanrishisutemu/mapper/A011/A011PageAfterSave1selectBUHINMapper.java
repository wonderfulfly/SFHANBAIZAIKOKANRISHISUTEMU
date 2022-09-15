package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectBUHINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011PageAfterSave1selectBUHINMapper
 * @version

 */

public interface A011PageAfterSave1selectBUHINMapper {
	public List<A011PageAfterSave1selectBUHINEntity> A011PageAfterSave1selectBUHIN(@Param("ay6_TYUMONSYO_CHUUBUNSHONO")String ay6_TYUMONSYO_CHUUBUNSHONO, @Param("ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO")String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
}