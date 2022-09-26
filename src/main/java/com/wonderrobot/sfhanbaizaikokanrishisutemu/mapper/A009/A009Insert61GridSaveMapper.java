package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A009Insert61GridSaveMapper
 * @version

 */

public interface A009Insert61GridSaveMapper {
	public int A009Insert61GridSaveData(@Param("SHIHARAIHIDZUKE")String SHIHARAIHIDZUKE, @Param("SHIHARAIWARIAI")String SHIHARAIWARIAI, @Param("FURIDASHIZUMIHIDZUKE")String FURIDASHIZUMIHIDZUKE, @Param("FURIDASHIZUMIKINGAKU")String FURIDASHIZUMIKINGAKU, @Param("FURIDASHIZUMIWARIAI")String FURIDASHIZUMIWARIAI, @Param("NYUUKINZUMIHIDZUKE")String NYUUKINZUMIHIDZUKE, @Param("NYUUKINZUMIKINGAKU")String NYUUKINZUMIKINGAKU, @Param("NYUUKINZUMIWARIAI")String NYUUKINZUMIWARIAI, @Param("RESHIITOMEISAINO")String RESHIITOMEISAINO, @Param("RESHIITONO")String RESHIITONO);
}