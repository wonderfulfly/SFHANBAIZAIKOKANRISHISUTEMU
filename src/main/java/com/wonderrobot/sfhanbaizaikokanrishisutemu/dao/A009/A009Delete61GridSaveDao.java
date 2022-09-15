package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009Delete61GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009Delete61GridSaveDao
 * @version

 */

@Repository
public class A009Delete61GridSaveDao {
	@Autowired
	private A009Delete61GridSaveMapper A009Delete61GridSaveMapper;

   
	public int A009Delete61GridSaveData (String RESHIITONO, String RESHIITOMEISAINO) throws Exception {

		int returnVal = A009Delete61GridSaveMapper.A009Delete61GridSaveData(RESHIITONO,RESHIITOMEISAINO);
		return returnVal;
	}
}