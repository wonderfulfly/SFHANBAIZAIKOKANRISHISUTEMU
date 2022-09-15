package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1updateKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1updateKAISYADao
 * @version

 */

@Repository
public class A011PageAfterSave1updateKAISYADao {
	@Autowired
	private A011PageAfterSave1updateKAISYAMapper A011PageAfterSave1updateKAISYAMapper;

   
	public int A011PageAfterSave1updateKAISYA (String ADORESU1, String DENWABANGOU1, String KYAKUSAKIMEISHOU) throws Exception {

		int returnVal = A011PageAfterSave1updateKAISYAMapper.A011PageAfterSave1updateKAISYA(ADORESU1,DENWABANGOU1,KYAKUSAKIMEISHOU);
		return returnVal;
	}
}