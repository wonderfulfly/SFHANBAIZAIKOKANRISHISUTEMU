package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013Insert99GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013Insert99GridSaveDao
 * @version

 */

@Repository
public class A013Insert99GridSaveDao {
	@Autowired
	private A013Insert99GridSaveMapper A013Insert99GridSaveMapper;

   
	public int A013Insert99GridSaveData (String SEISAKUHINKUBUN, String HINBANNO1, String HINMEI, String KOSUU, String SOUKOSUU, String TSUKAMATSUNYUUSAKI, String KIBOUNOUKI, String TANTOU, String TEHAISAKI, String KOUNYUUTANKA, String KAHEI, String TEHAIBI, String NYUUKABI, String SHOUKEI, String KAKOTANKA, String CHUUBUNSHOMEISAINO, String CHUUBUNSHONO, String KIBOUTANKA, String NYUUKAYOTEIBI, String HINBANNO, String KAKUTEIKUBUN, String KOUJIKANRIBANGOU) throws Exception {

		int returnVal = A013Insert99GridSaveMapper.A013Insert99GridSaveData(SEISAKUHINKUBUN,HINBANNO1,HINMEI,KOSUU,SOUKOSUU,TSUKAMATSUNYUUSAKI,KIBOUNOUKI,TANTOU,TEHAISAKI,KOUNYUUTANKA,KAHEI,TEHAIBI,NYUUKABI,SHOUKEI,KAKOTANKA,CHUUBUNSHOMEISAINO,CHUUBUNSHONO,KIBOUTANKA,NYUUKAYOTEIBI,HINBANNO,KAKUTEIKUBUN,KOUJIKANRIBANGOU);
		return returnVal;
	}
}