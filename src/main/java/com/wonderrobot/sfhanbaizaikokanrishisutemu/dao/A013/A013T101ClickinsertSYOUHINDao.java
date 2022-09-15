package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickinsertSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickinsertSYOUHINDao
 * @version

 */

@Repository
public class A013T101ClickinsertSYOUHINDao {
	@Autowired
	private A013T101ClickinsertSYOUHINMapper A013T101ClickinsertSYOUHINMapper;

   
	public int A013T101ClickinsertSYOUHIN (String SHOUHINNUMBER, String ay3_BUHINSYOUSAI_HINMEI, String ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, String ay3_BUHINSYOUSAI_ZAISHITSU, double ay3_BUHINSYOUSAI_KOUNYUUTANKA, int ay3_BUHINSYOUSAI_SOUKOSUU, String ay3_BUHINSYOUSAI_NYUUKABI) throws Exception {

		int returnVal = A013T101ClickinsertSYOUHINMapper.A013T101ClickinsertSYOUHIN(SHOUHINNUMBER,ay3_BUHINSYOUSAI_HINMEI,ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI,ay3_BUHINSYOUSAI_ZAISHITSU,ay3_BUHINSYOUSAI_KOUNYUUTANKA,ay3_BUHINSYOUSAI_SOUKOSUU,ay3_BUHINSYOUSAI_NYUUKABI);
		return returnVal;
	}
}