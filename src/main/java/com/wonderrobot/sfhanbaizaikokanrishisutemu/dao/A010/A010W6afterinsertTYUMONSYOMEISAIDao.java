package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertTYUMONSYOMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertTYUMONSYOMEISAIDao
 * @version

 */

@Repository
public class A010W6afterinsertTYUMONSYOMEISAIDao {
	@Autowired
	private A010W6afterinsertTYUMONSYOMEISAIMapper A010W6afterinsertTYUMONSYOMEISAIMapper;

   
	public int A010W6afterinsertTYUMONSYOMEISAI (String CHUUBUNSHONOautoNum, String CHUUBUNSHOMEISAINOautoNum, String MITUMORIRINJIHYOU_KOUMOKU, int MITUMORIRINJIHYOU_SUURYOU, double MITUMORIRINJIHYOU_PRICE, double MITUMORIRINJIHYOU_GOLD, String MITUMORIRINJIHYOU_KAHEI) throws Exception {

		int returnVal = A010W6afterinsertTYUMONSYOMEISAIMapper.A010W6afterinsertTYUMONSYOMEISAI(CHUUBUNSHONOautoNum,CHUUBUNSHOMEISAINOautoNum,MITUMORIRINJIHYOU_KOUMOKU,MITUMORIRINJIHYOU_SUURYOU,MITUMORIRINJIHYOU_PRICE,MITUMORIRINJIHYOU_GOLD,MITUMORIRINJIHYOU_KAHEI);
		return returnVal;
	}
}