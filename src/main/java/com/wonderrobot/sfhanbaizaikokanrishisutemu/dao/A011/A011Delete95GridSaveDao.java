package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011Delete95GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Delete95GridSaveDao
 * @version

 */

@Repository
public class A011Delete95GridSaveDao {
	@Autowired
	private A011Delete95GridSaveMapper A011Delete95GridSaveMapper;

   
	public int A011Delete95GridSaveData (String CHUUBUNSHONO, String CHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = A011Delete95GridSaveMapper.A011Delete95GridSaveData(CHUUBUNSHONO,CHUUBUNSHOMEISAINO);
		return returnVal;
	}
}