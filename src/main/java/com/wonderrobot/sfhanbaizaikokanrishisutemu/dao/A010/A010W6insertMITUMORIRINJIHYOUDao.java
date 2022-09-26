package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6insertMITUMORIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A010W6insertMITUMORIRINJIHYOUDao
 * @version

 */

@Repository
public class A010W6insertMITUMORIRINJIHYOUDao {
	@Autowired
	private A010W6insertMITUMORIRINJIHYOUMapper A010W6insertMITUMORIRINJIHYOUMapper;

   
	public int A010W6insertMITUMORIRINJIHYOU (String HIDZUKE, String KYAKUSAKI, String KYAKUSAKITANTOU, String MITSUMORINO, String SAKUSEISHA, String HINMEI, double BANGOU, String KOUMOKU, int SUURYOU, double PRICE, double GOLD, String KAHEI, String KIROKUSHAID) throws Exception {

		int returnVal = A010W6insertMITUMORIRINJIHYOUMapper.A010W6insertMITUMORIRINJIHYOU(HIDZUKE,KYAKUSAKI,KYAKUSAKITANTOU,MITSUMORINO,SAKUSEISHA,HINMEI,BANGOU,KOUMOKU,SUURYOU,PRICE,GOLD,KAHEI,KIROKUSHAID);
		return returnVal;
	}
}