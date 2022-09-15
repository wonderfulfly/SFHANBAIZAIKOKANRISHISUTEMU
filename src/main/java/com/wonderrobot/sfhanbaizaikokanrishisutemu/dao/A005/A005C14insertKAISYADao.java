package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C14insertKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A005C14insertKAISYADao
 * @version

 */

@Repository
public class A005C14insertKAISYADao {
	@Autowired
	private A005C14insertKAISYAMapper A005C14insertKAISYAMapper;

   
	public int A005C14insertKAISYA (String KAISHAID, String KAISHAMEI, String KAISHARYAKUSHOU, String ADORESU, String RENRAKUSAKI, int SHIHARAIKIGEN, String KAISHAKUBUN) throws Exception {

		int returnVal = A005C14insertKAISYAMapper.A005C14insertKAISYA(KAISHAID,KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN);
		return returnVal;
	}
}