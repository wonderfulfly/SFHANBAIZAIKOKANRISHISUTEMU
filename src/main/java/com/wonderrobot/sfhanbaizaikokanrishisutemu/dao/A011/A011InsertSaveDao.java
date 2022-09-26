package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011InsertSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011InsertSaveDao
 * @version

 */

@Repository
public class A011InsertSaveDao {
	@Autowired
	private A011InsertSaveMapper A011InsertSaveMapper;

   
	public int A011InsertSaveData (String SHUTSUNYUUKOFURAGU, String CHUUMONHIDZUKE, String CHUUBUNSHONO, String SHUKKANO, String MITSUMORISHONO, String KYAKUSAKIID, String KYAKUSAKITANTOU, String ADORESU, String DENWABANGOU, String RESHIITONO, String SHANAIKOUJIBANGOU, String HINMEI, String TANTOUSHAID, String KEIYAKUSAKI, String NOUKIYOTEIBI, String NOUNYUUBI, String SHOUHINSOUGAKUJPY, String SHOUHINSOUGAKURMB, String SHOUHINSOUGAKUUSD) throws Exception {

		int returnVal = A011InsertSaveMapper.A011InsertSaveData(SHUTSUNYUUKOFURAGU,CHUUMONHIDZUKE,CHUUBUNSHONO,SHUKKANO,MITSUMORISHONO,KYAKUSAKIID,KYAKUSAKITANTOU,ADORESU,DENWABANGOU,RESHIITONO,SHANAIKOUJIBANGOU,HINMEI,TANTOUSHAID,KEIYAKUSAKI,NOUKIYOTEIBI,NOUNYUUBI,SHOUHINSOUGAKUJPY,SHOUHINSOUGAKURMB,SHOUHINSOUGAKUUSD);
		return returnVal;
	}
}