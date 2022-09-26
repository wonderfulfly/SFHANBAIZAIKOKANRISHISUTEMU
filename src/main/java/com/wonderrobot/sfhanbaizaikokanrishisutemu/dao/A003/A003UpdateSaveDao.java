package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003UpdateSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003UpdateSaveDao
 * @version

 */

@Repository
public class A003UpdateSaveDao {
	@Autowired
	private A003UpdateSaveMapper A003UpdateSaveMapper;

   
	public int A003UpdateSaveData (String BUMONID, String BUMONMEI, String BUMONID1) throws Exception {

		int returnVal = A003UpdateSaveMapper.A003UpdateSaveData(BUMONID,BUMONMEI,BUMONID1);
		return returnVal;
	}
}