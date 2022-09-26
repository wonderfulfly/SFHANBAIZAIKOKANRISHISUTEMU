package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004InsertSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004InsertSaveDao
 * @version

 */

@Repository
public class A004InsertSaveDao {
	@Autowired
	private A004InsertSaveMapper A004InsertSaveMapper;

   
	public int A004InsertSaveData (String KAISHAID, String KAISHAMEI, String KAISHARYAKUSHOU, String ADORESU, String RENRAKUSAKI, String SHIHARAIKIGEN, String KAISHAKUBUN) throws Exception {

		int returnVal = A004InsertSaveMapper.A004InsertSaveData(KAISHAID,KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN);
		return returnVal;
	}
}