package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009Insert61GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009Insert61GridSaveDao
 * @version

 */

@Repository
public class A009Insert61GridSaveDao {
	@Autowired
	private A009Insert61GridSaveMapper A009Insert61GridSaveMapper;

   
	public int A009Insert61GridSaveData (String SHIHARAIHIDZUKE, String SHIHARAIWARIAI, String FURIDASHIZUMIHIDZUKE, String FURIDASHIZUMIKINGAKU, String FURIDASHIZUMIWARIAI, String NYUUKINZUMIHIDZUKE, String NYUUKINZUMIKINGAKU, String NYUUKINZUMIWARIAI, String RESHIITOMEISAINO, String RESHIITONO) throws Exception {

		int returnVal = A009Insert61GridSaveMapper.A009Insert61GridSaveData(SHIHARAIHIDZUKE,SHIHARAIWARIAI,FURIDASHIZUMIHIDZUKE,FURIDASHIZUMIKINGAKU,FURIDASHIZUMIWARIAI,NYUUKINZUMIHIDZUKE,NYUUKINZUMIKINGAKU,NYUUKINZUMIWARIAI,RESHIITOMEISAINO,RESHIITONO);
		return returnVal;
	}
}