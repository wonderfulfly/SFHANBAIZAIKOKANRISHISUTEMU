package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009UpdateSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009UpdateSaveDao
 * @version

 */

@Repository
public class A009UpdateSaveDao {
	@Autowired
	private A009UpdateSaveMapper A009UpdateSaveMapper;

   
	public int A009UpdateSaveData (String KYAKUSAKIID, String TANTOUSHAID, String RESHIITONO, String CHUUBUNSHONO, String KANTOKU, String CHUUMONHIDZUKE, String NYUUKINKINGAKU, String JISSAINYUUKINJOUTAI, String RESHIITONO1) throws Exception {

		int returnVal = A009UpdateSaveMapper.A009UpdateSaveData(KYAKUSAKIID,TANTOUSHAID,RESHIITONO,CHUUBUNSHONO,KANTOKU,CHUUMONHIDZUKE,NYUUKINKINGAKU,JISSAINYUUKINJOUTAI,RESHIITONO1);
		return returnVal;
	}
}