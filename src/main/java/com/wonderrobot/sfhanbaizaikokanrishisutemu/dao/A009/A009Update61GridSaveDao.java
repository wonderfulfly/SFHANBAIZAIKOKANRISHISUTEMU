package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009Update61GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009Update61GridSaveDao
 * @version

 */

@Repository
public class A009Update61GridSaveDao {
	@Autowired
	private A009Update61GridSaveMapper A009Update61GridSaveMapper;

   
	public int A009Update61GridSaveData (String SHIHARAIHIDZUKE, String SHIHARAIWARIAI, String FURIDASHIZUMIHIDZUKE, String FURIDASHIZUMIKINGAKU, String FURIDASHIZUMIWARIAI, String NYUUKINZUMIHIDZUKE, String NYUUKINZUMIKINGAKU, String NYUUKINZUMIWARIAI, String RESHIITOMEISAINO, String RESHIITONO, String RESHIITONO1, String RESHIITOMEISAINO1) throws Exception {

		int returnVal = A009Update61GridSaveMapper.A009Update61GridSaveData(SHIHARAIHIDZUKE,SHIHARAIWARIAI,FURIDASHIZUMIHIDZUKE,FURIDASHIZUMIKINGAKU,FURIDASHIZUMIWARIAI,NYUUKINZUMIHIDZUKE,NYUUKINZUMIKINGAKU,NYUUKINZUMIWARIAI,RESHIITOMEISAINO,RESHIITONO,RESHIITONO1,RESHIITOMEISAINO1);
		return returnVal;
	}
}