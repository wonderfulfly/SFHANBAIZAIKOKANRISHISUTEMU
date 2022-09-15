package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickupdateBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao {
	@Autowired
	private A013grdB16AC161ClickupdateBUHINSYOUSAI1Mapper A013grdB16AC161ClickupdateBUHINSYOUSAI1Mapper;

   
	public int A013grdB16AC161ClickupdateBUHINSYOUSAI1 (String SEISAKUHINKUBUN, String HINMEI, String HINBANNO1, int KOSUU, int SOUKOSUU, String TSUKAMATSUNYUUSAKI, String TANTOU, String TEHAISAKI, double KOUNYUUTANKA1, String KAHEI, double SHOUKEI, String NYUUKABI, String TEHAIBI, String KIBOUNOUKI, String ay4_BUHINSYOUSAI_CHUUBUNSHONO, String CHUUBUNSHOMEISAINO1, String KOUJIKANRIBANGOU1, String HINBANNO) throws Exception {

		int returnVal = A013grdB16AC161ClickupdateBUHINSYOUSAI1Mapper.A013grdB16AC161ClickupdateBUHINSYOUSAI1(SEISAKUHINKUBUN,HINMEI,HINBANNO1,KOSUU,SOUKOSUU,TSUKAMATSUNYUUSAKI,TANTOU,TEHAISAKI,KOUNYUUTANKA1,KAHEI,SHOUKEI,NYUUKABI,TEHAIBI,KIBOUNOUKI,ay4_BUHINSYOUSAI_CHUUBUNSHONO,CHUUBUNSHOMEISAINO1,KOUJIKANRIBANGOU1,HINBANNO);
		return returnVal;
	}
}