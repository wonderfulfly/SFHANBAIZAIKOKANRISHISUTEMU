package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickinsertSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickinsertSYOUHINDao
 * @version

 */

@Repository
public class A013grdB16AC161ClickinsertSYOUHINDao {
	@Autowired
	private A013grdB16AC161ClickinsertSYOUHINMapper A013grdB16AC161ClickinsertSYOUHINMapper;

   
	public int A013grdB16AC161ClickinsertSYOUHIN (String KETSUGOUMOJI2, String ay6_BUHINSYOUSAI_HINMEI, String ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, String ay6_BUHINSYOUSAI_ZAISHITSU, double ay6_BUHINSYOUSAI_KOUNYUUTANKA, int ay6_BUHINSYOUSAI_SOUKOSUU, String ay6_BUHINSYOUSAI_NYUUKABI) throws Exception {

		int returnVal = A013grdB16AC161ClickinsertSYOUHINMapper.A013grdB16AC161ClickinsertSYOUHIN(KETSUGOUMOJI2,ay6_BUHINSYOUSAI_HINMEI,ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI,ay6_BUHINSYOUSAI_ZAISHITSU,ay6_BUHINSYOUSAI_KOUNYUUTANKA,ay6_BUHINSYOUSAI_SOUKOSUU,ay6_BUHINSYOUSAI_NYUUKABI);
		return returnVal;
	}
}