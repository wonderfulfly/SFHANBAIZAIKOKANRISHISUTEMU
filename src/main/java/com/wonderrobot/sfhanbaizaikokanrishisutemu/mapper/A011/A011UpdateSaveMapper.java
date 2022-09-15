package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011UpdateSaveMapper
 * @version

 */

public interface A011UpdateSaveMapper {
	public int A011UpdateSaveData(@Param("SHUTSUNYUUKOFURAGU")String SHUTSUNYUUKOFURAGU, @Param("CHUUMONHIDZUKE")String CHUUMONHIDZUKE, @Param("CHUUBUNSHONO")String CHUUBUNSHONO, @Param("SHUKKANO")String SHUKKANO, @Param("MITSUMORISHONO")String MITSUMORISHONO, @Param("KYAKUSAKIID")String KYAKUSAKIID, @Param("KYAKUSAKITANTOU")String KYAKUSAKITANTOU, @Param("ADORESU")String ADORESU, @Param("DENWABANGOU")String DENWABANGOU, @Param("RESHIITONO")String RESHIITONO, @Param("SHANAIKOUJIBANGOU")String SHANAIKOUJIBANGOU, @Param("HINMEI")String HINMEI, @Param("TANTOUSHAID")String TANTOUSHAID, @Param("KEIYAKUSAKI")String KEIYAKUSAKI, @Param("NOUKIYOTEIBI")String NOUKIYOTEIBI, @Param("NOUNYUUBI")String NOUNYUUBI, @Param("SHOUHINSOUGAKUJPY")String SHOUHINSOUGAKUJPY, @Param("SHOUHINSOUGAKURMB")String SHOUHINSOUGAKURMB, @Param("SHOUHINSOUGAKUUSD")String SHOUHINSOUGAKUUSD, @Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}