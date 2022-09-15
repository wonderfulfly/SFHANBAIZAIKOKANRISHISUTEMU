package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickinsertZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickinsertZAIKOUDao
 * @version

 */

@Repository
public class A013T101ClickinsertZAIKOUDao {
	@Autowired
	private A013T101ClickinsertZAIKOUMapper A013T101ClickinsertZAIKOUMapper;

   
	public int A013T101ClickinsertZAIKOU (String ay3_BUHINSYOUSAI_HINMEI, String TOUJITSU, String ay3_BUHINSYOUSAI_CHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU, String ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, double ay3_BUHINSYOUSAI_SHOUKEI, String SHUKKANO1, int ay3_BUHINSYOUSAI_SOUKOSUU, String ZAIKONOautoNum, double ay3_BUHINSYOUSAI_KOUNYUUTANKA, String ay3_BUHINSYOUSAI_HINBANNO) throws Exception {

		int returnVal = A013T101ClickinsertZAIKOUMapper.A013T101ClickinsertZAIKOU(ay3_BUHINSYOUSAI_HINMEI,TOUJITSU,ay3_BUHINSYOUSAI_CHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU,ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI,ay3_BUHINSYOUSAI_SHOUKEI,SHUKKANO1,ay3_BUHINSYOUSAI_SOUKOSUU,ZAIKONOautoNum,ay3_BUHINSYOUSAI_KOUNYUUTANKA,ay3_BUHINSYOUSAI_HINBANNO);
		return returnVal;
	}
}