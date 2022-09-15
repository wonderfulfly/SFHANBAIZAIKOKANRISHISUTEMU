package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006Delete19GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Delete19GridSaveDao
 * @version

 */

@Repository
public class A006Delete19GridSaveDao {
	@Autowired
	private A006Delete19GridSaveMapper A006Delete19GridSaveMapper;

   
	public int A006Delete19GridSaveData (String SHOUHINNO) throws Exception {

		int returnVal = A006Delete19GridSaveMapper.A006Delete19GridSaveData(SHOUHINNO);
		return returnVal;
	}
}