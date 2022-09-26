package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004O14insertKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A004O14insertKAISYADao
 * @version

 */

@Repository
public class A004O14insertKAISYADao {
	@Autowired
	private A004O14insertKAISYAMapper A004O14insertKAISYAMapper;

   
	public int A004O14insertKAISYA (String KAISHAMEI, String KAISHARYAKUSHOU, String ADORESU, String RENRAKUSAKI, int SHIHARAIKIGEN, String KAISHAKUBUN, String KAISHAID) throws Exception {

		int returnVal = A004O14insertKAISYAMapper.A004O14insertKAISYA(KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN,KAISHAID);
		return returnVal;
	}
}