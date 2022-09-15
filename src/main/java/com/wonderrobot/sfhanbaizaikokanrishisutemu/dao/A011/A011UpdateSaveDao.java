package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011UpdateSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011UpdateSaveDao
 * @version

 */

@Repository
public class A011UpdateSaveDao {
	@Autowired
	private A011UpdateSaveMapper A011UpdateSaveMapper;

   
	public int A011UpdateSaveData (String SHUTSUNYUUKOFURAGU, String CHUUMONHIDZUKE, String CHUUBUNSHONO, String SHUKKANO, String MITSUMORISHONO, String KYAKUSAKIID, String KYAKUSAKITANTOU, String ADORESU, String DENWABANGOU, String RESHIITONO, String SHANAIKOUJIBANGOU, String HINMEI, String TANTOUSHAID, String KEIYAKUSAKI, String NOUKIYOTEIBI, String NOUNYUUBI, String SHOUHINSOUGAKUJPY, String SHOUHINSOUGAKURMB, String SHOUHINSOUGAKUUSD, String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011UpdateSaveMapper.A011UpdateSaveData(SHUTSUNYUUKOFURAGU,CHUUMONHIDZUKE,CHUUBUNSHONO,SHUKKANO,MITSUMORISHONO,KYAKUSAKIID,KYAKUSAKITANTOU,ADORESU,DENWABANGOU,RESHIITONO,SHANAIKOUJIBANGOU,HINMEI,TANTOUSHAID,KEIYAKUSAKI,NOUKIYOTEIBI,NOUNYUUBI,SHOUHINSOUGAKUJPY,SHOUHINSOUGAKURMB,SHOUHINSOUGAKUUSD,CHUUBUNSHONO1);
		return returnVal;
	}
}