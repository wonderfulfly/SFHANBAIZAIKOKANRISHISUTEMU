package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003InsertSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003InsertSaveDao
 * @version

 */

@Repository
public class A003InsertSaveDao {
	@Autowired
	private A003InsertSaveMapper A003InsertSaveMapper;

   
	public int A003InsertSaveData (String BUMONID, String BUMONMEI) throws Exception {

		int returnVal = A003InsertSaveMapper.A003InsertSaveData(BUMONID,BUMONMEI);
		return returnVal;
	}
}