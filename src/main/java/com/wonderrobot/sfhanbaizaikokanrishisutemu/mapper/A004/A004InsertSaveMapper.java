package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A004InsertSaveMapper
 * @version

 */

public interface A004InsertSaveMapper {
	public int A004InsertSaveData(@Param("KAISHAID")String KAISHAID, @Param("KAISHAMEI")String KAISHAMEI, @Param("KAISHARYAKUSHOU")String KAISHARYAKUSHOU, @Param("ADORESU")String ADORESU, @Param("RENRAKUSAKI")String RENRAKUSAKI, @Param("SHIHARAIKIGEN")String SHIHARAIKIGEN, @Param("KAISHAKUBUN")String KAISHAKUBUN);
}