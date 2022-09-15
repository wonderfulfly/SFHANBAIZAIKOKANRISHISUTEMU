package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001InsertSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001InsertSaveDao
 * @version

 */

@Repository
public class A001InsertSaveDao {
	@Autowired
	private A001InsertSaveMapper A001InsertSaveMapper;

   
	public int A001InsertSaveData (String SHAINID, String SHAINMEI, String DENWABANGOU, String KEITAIBANGOU, String EMAIL, String LINE, String YUUZAAKENGEN, String YUUKOUKUBUN, String ROGUINID, String PASUWAADO) throws Exception {

		int returnVal = A001InsertSaveMapper.A001InsertSaveData(SHAINID,SHAINMEI,DENWABANGOU,KEITAIBANGOU,EMAIL,LINE,YUUZAAKENGEN,YUUKOUKUBUN,ROGUINID,PASUWAADO);
		return returnVal;
	}
}