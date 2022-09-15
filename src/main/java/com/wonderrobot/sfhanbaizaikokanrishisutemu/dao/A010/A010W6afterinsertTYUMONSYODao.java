package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertTYUMONSYODao
 * @version

 */

@Repository
public class A010W6afterinsertTYUMONSYODao {
	@Autowired
	private A010W6afterinsertTYUMONSYOMapper A010W6afterinsertTYUMONSYOMapper;

   
	public int A010W6afterinsertTYUMONSYO (String CHUUBUNSHONOautoNum, String MITUMORIRINJIHYOU_MITSUMORINO, String MITUMORIRINJIHYOU_HIDZUKE, String KAISHAID2, double JPY1, String MITUMORIRINJIHYOU_SAKUSEISHA, String MITUMORIRINJIHYOU_HINMEI, double MITUMORIRINJIHYOU_GOUKEI, String MITUMORIRINJIHYOU_KYAKUSAKITANTOU, double RMB1, double USD1) throws Exception {

		int returnVal = A010W6afterinsertTYUMONSYOMapper.A010W6afterinsertTYUMONSYO(CHUUBUNSHONOautoNum,MITUMORIRINJIHYOU_MITSUMORINO,MITUMORIRINJIHYOU_HIDZUKE,KAISHAID2,JPY1,MITUMORIRINJIHYOU_SAKUSEISHA,MITUMORIRINJIHYOU_HINMEI,MITUMORIRINJIHYOU_GOUKEI,MITUMORIRINJIHYOU_KYAKUSAKITANTOU,RMB1,USD1);
		return returnVal;
	}
}