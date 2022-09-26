package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006Update19GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Update19GridSaveDao
 * @version

 */

@Repository
public class A006Update19GridSaveDao {
	@Autowired
	private A006Update19GridSaveMapper A006Update19GridSaveMapper;

   
	public int A006Update19GridSaveData (String SHOUHINMEISHOU, String ZAISHITSU, String TSUKAMATSUNYUUSAKI, String NYUUKAHIDZUKE, String PRICE, String ZAIKOSUURYOU, String SHOUHINNO, String SHOUHINNO1) throws Exception {

		int returnVal = A006Update19GridSaveMapper.A006Update19GridSaveData(SHOUHINMEISHOU,ZAISHITSU,TSUKAMATSUNYUUSAKI,NYUUKAHIDZUKE,PRICE,ZAIKOSUURYOU,SHOUHINNO,SHOUHINNO1);
		return returnVal;
	}
}