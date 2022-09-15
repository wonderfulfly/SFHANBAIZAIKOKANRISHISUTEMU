package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterinsertMITUMORIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterinsertMITUMORIDao
 * @version

 */

@Repository
public class A010W6afterinsertMITUMORIDao {
	@Autowired
	private A010W6afterinsertMITUMORIMapper A010W6afterinsertMITUMORIMapper;

   
	public int A010W6afterinsertMITUMORI (String MITUMORIRINJIHYOU_MITSUMORINO, String MITUMORIRINJIHYOU_HIDZUKE, String MITUMORIRINJIHYOU_KYAKUSAKI, String MITUMORIRINJIHYOU_SAKUSEISHA, String MITUMORIRINJIHYOU_HINMEI, double MITUMORIRINJIHYOU_GOUKEI) throws Exception {

		int returnVal = A010W6afterinsertMITUMORIMapper.A010W6afterinsertMITUMORI(MITUMORIRINJIHYOU_MITSUMORINO,MITUMORIRINJIHYOU_HIDZUKE,MITUMORIRINJIHYOU_KYAKUSAKI,MITUMORIRINJIHYOU_SAKUSEISHA,MITUMORIRINJIHYOU_HINMEI,MITUMORIRINJIHYOU_GOUKEI);
		return returnVal;
	}
}