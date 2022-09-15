package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickupdateBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickupdateBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013T101ClickupdateBUHINSYOUSAIDao {
	@Autowired
	private A013T101ClickupdateBUHINSYOUSAIMapper A013T101ClickupdateBUHINSYOUSAIMapper;

   
	public int A013T101ClickupdateBUHINSYOUSAI (String SEISAKUHINKUBUN, String HINMEI, String HINBANNO1, int KOSUU1, int SOUKOSUU1, String TSUKAMATSUNYUUSAKI, String TANTOU, String TEHAISAKI, double KOUNYUUTANKA1, String KAHEI, double SHOUKEI1, String NYUUKABI, String TEHAIBI, String KIBOUNOUKI, String CHUUBUNSHONO1, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1, String HINBANNO) throws Exception {

		int returnVal = A013T101ClickupdateBUHINSYOUSAIMapper.A013T101ClickupdateBUHINSYOUSAI(SEISAKUHINKUBUN,HINMEI,HINBANNO1,KOSUU1,SOUKOSUU1,TSUKAMATSUNYUUSAKI,TANTOU,TEHAISAKI,KOUNYUUTANKA1,KAHEI,SHOUKEI1,NYUUKABI,TEHAIBI,KIBOUNOUKI,CHUUBUNSHONO1,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1,HINBANNO);
		return returnVal;
	}
}