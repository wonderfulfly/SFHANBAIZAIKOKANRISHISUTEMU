package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001UpdateSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001UpdateSaveDao
 * @version

 */

@Repository
public class A001UpdateSaveDao {
	@Autowired
	private A001UpdateSaveMapper A001UpdateSaveMapper;

   
	public int A001UpdateSaveData (String SHAINID, String SHAINMEI, String DENWABANGOU, String KEITAIBANGOU, String EMAIL, String LINE, String YUUZAAKENGEN, String YUUKOUKUBUN, String ROGUINID, String PASUWAADO, String SHAINID1, String ROGUINID1) throws Exception {

		int returnVal = A001UpdateSaveMapper.A001UpdateSaveData(SHAINID,SHAINMEI,DENWABANGOU,KEITAIBANGOU,EMAIL,LINE,YUUZAAKENGEN,YUUKOUKUBUN,ROGUINID,PASUWAADO,SHAINID1,ROGUINID1);
		return returnVal;
	}
}