package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009InsertSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009InsertSaveDao
 * @version

 */

@Repository
public class A009InsertSaveDao {
	@Autowired
	private A009InsertSaveMapper A009InsertSaveMapper;

   
	public int A009InsertSaveData (String KYAKUSAKIID, String TANTOUSHAID, String RESHIITONO, String CHUUBUNSHONO, String KANTOKU, String CHUUMONHIDZUKE, String NYUUKINKINGAKU, String JISSAINYUUKINJOUTAI) throws Exception {

		int returnVal = A009InsertSaveMapper.A009InsertSaveData(KYAKUSAKIID,TANTOUSHAID,RESHIITONO,CHUUBUNSHONO,KANTOKU,CHUUMONHIDZUKE,NYUUKINKINGAKU,JISSAINYUUKINJOUTAI);
		return returnVal;
	}
}