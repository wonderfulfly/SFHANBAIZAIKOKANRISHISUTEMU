package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A004UpdateSaveMapper
 * @version

 */

public interface A004UpdateSaveMapper {
	public int A004UpdateSaveData(@Param("KAISHAID")String KAISHAID, @Param("KAISHAMEI")String KAISHAMEI, @Param("KAISHARYAKUSHOU")String KAISHARYAKUSHOU, @Param("ADORESU")String ADORESU, @Param("RENRAKUSAKI")String RENRAKUSAKI, @Param("SHIHARAIKIGEN")String SHIHARAIKIGEN, @Param("KAISHAKUBUN")String KAISHAKUBUN, @Param("KAISHAID1")String KAISHAID1);
}