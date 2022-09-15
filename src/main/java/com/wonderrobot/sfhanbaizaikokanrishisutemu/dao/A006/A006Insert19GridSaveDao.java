package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006Insert19GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006Insert19GridSaveDao
 * @version

 */

@Repository
public class A006Insert19GridSaveDao {
	@Autowired
	private A006Insert19GridSaveMapper A006Insert19GridSaveMapper;

   
	public int A006Insert19GridSaveData (String SHOUHINMEISHOU, String ZAISHITSU, String TSUKAMATSUNYUUSAKI, String NYUUKAHIDZUKE, String PRICE, String ZAIKOSUURYOU, String SHOUHINNO) throws Exception {

		int returnVal = A006Insert19GridSaveMapper.A006Insert19GridSaveData(SHOUHINMEISHOU,ZAISHITSU,TSUKAMATSUNYUUSAKI,NYUUKAHIDZUKE,PRICE,ZAIKOSUURYOU,SHOUHINNO);
		return returnVal;
	}
}