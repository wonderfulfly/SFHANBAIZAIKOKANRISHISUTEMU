package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertKAISYADao
 * @version

 */

@Repository
public class A010W6afterinsertKAISYADao {
	@Autowired
	private A010W6afterinsertKAISYAMapper A010W6afterinsertKAISYAMapper;

   
	public int A010W6afterinsertKAISYA (String KAISHAIDautoNum, String MITUMORIRINJIHYOU_KYAKUSAKI) throws Exception {

		int returnVal = A010W6afterinsertKAISYAMapper.A010W6afterinsertKAISYA(KAISHAIDautoNum,MITUMORIRINJIHYOU_KYAKUSAKI);
		return returnVal;
	}
}