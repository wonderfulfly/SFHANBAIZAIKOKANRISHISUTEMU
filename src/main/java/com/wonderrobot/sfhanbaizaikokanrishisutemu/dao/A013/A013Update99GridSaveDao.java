package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013Update99GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013Update99GridSaveDao
 * @version

 */

@Repository
public class A013Update99GridSaveDao {
	@Autowired
	private A013Update99GridSaveMapper A013Update99GridSaveMapper;

   
	public int A013Update99GridSaveData (String SEISAKUHINKUBUN, String HINBANNO1, String HINMEI, String KOSUU, String SOUKOSUU, String TSUKAMATSUNYUUSAKI, String KIBOUNOUKI, String TANTOU, String TEHAISAKI, String KOUNYUUTANKA, String KAHEI, String TEHAIBI, String NYUUKABI, String SHOUKEI, String KAKOTANKA, String CHUUBUNSHOMEISAINO, String CHUUBUNSHONO, String KIBOUTANKA, String NYUUKAYOTEIBI, String HINBANNO, String KAKUTEIKUBUN, String KOUJIKANRIBANGOU, String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1, String HINBANNO2) throws Exception {

		int returnVal = A013Update99GridSaveMapper.A013Update99GridSaveData(SEISAKUHINKUBUN,HINBANNO1,HINMEI,KOSUU,SOUKOSUU,TSUKAMATSUNYUUSAKI,KIBOUNOUKI,TANTOU,TEHAISAKI,KOUNYUUTANKA,KAHEI,TEHAIBI,NYUUKABI,SHOUKEI,KAKOTANKA,CHUUBUNSHOMEISAINO,CHUUBUNSHONO,KIBOUTANKA,NYUUKAYOTEIBI,HINBANNO,KAKUTEIKUBUN,KOUJIKANRIBANGOU,CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1,HINBANNO2);
		return returnVal;
	}
}