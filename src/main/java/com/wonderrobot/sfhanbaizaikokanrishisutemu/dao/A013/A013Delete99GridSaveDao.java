package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013Delete99GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013Delete99GridSaveDao
 * @version

 */

@Repository
public class A013Delete99GridSaveDao {
	@Autowired
	private A013Delete99GridSaveMapper A013Delete99GridSaveMapper;

   
	public int A013Delete99GridSaveData (String CHUUBUNSHONO, String CHUUBUNSHOMEISAINO, String HINBANNO) throws Exception {

		int returnVal = A013Delete99GridSaveMapper.A013Delete99GridSaveData(CHUUBUNSHONO,CHUUBUNSHOMEISAINO,HINBANNO);
		return returnVal;
	}
}