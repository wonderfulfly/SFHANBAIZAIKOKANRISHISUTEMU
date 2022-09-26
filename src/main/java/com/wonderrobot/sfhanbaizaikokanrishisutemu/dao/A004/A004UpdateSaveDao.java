package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004UpdateSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004UpdateSaveDao
 * @version

 */

@Repository
public class A004UpdateSaveDao {
	@Autowired
	private A004UpdateSaveMapper A004UpdateSaveMapper;

   
	public int A004UpdateSaveData (String KAISHAID, String KAISHAMEI, String KAISHARYAKUSHOU, String ADORESU, String RENRAKUSAKI, String SHIHARAIKIGEN, String KAISHAKUBUN, String KAISHAID1) throws Exception {

		int returnVal = A004UpdateSaveMapper.A004UpdateSaveData(KAISHAID,KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN,KAISHAID1);
		return returnVal;
	}
}