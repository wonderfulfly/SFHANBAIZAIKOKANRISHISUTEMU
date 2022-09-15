package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickinsertZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickinsertZAIKOUDao
 * @version

 */

@Repository
public class A013grdB16AC161ClickinsertZAIKOUDao {
	@Autowired
	private A013grdB16AC161ClickinsertZAIKOUMapper A013grdB16AC161ClickinsertZAIKOUMapper;

   
	public int A013grdB16AC161ClickinsertZAIKOU (String ay6_BUHINSYOUSAI_HINMEI, String TOUJITSU, String ay6_BUHINSYOUSAI_CHUUBUNSHONO, String ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO, String ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU, String ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, double ay6_BUHINSYOUSAI_SHOUKEI, String SHUKKANO1, int ay6_BUHINSYOUSAI_SOUKOSUU, String ZAIKONOautoNum, double ay6_BUHINSYOUSAI_KOUNYUUTANKA, String ay6_BUHINSYOUSAI_HINBANNO) throws Exception {

		int returnVal = A013grdB16AC161ClickinsertZAIKOUMapper.A013grdB16AC161ClickinsertZAIKOU(ay6_BUHINSYOUSAI_HINMEI,TOUJITSU,ay6_BUHINSYOUSAI_CHUUBUNSHONO,ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO,ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU,ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI,ay6_BUHINSYOUSAI_SHOUKEI,SHUKKANO1,ay6_BUHINSYOUSAI_SOUKOSUU,ZAIKONOautoNum,ay6_BUHINSYOUSAI_KOUNYUUTANKA,ay6_BUHINSYOUSAI_HINBANNO);
		return returnVal;
	}
}