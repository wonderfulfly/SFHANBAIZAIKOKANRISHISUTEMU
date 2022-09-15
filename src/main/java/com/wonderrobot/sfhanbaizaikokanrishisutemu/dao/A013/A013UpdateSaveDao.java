package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013UpdateSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013UpdateSaveDao
 * @version

 */

@Repository
public class A013UpdateSaveDao {
	@Autowired
	private A013UpdateSaveMapper A013UpdateSaveMapper;

   
	public int A013UpdateSaveData (String TOKUISAKI, String MAISUU, String ASENBURIRAIN, String KAKUTEIKUBUN, String KIKAIMEISHOU, String BUHINMEISHOU, String CHUUBUNSHONO, String SEISAKUSUU, String TANTOUSHA, String KOUJIKANRIBANGOU, String SHUKKANO, String JPYGOUKEIKINGAKU, String RMBGOUKEIKINGAKU, String USDGOUKEIKINGAKU, String CHUUBUNSHOMEISAINO, String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1, String KOUJIKANRIBANGOU1) throws Exception {

		int returnVal = A013UpdateSaveMapper.A013UpdateSaveData(TOKUISAKI,MAISUU,ASENBURIRAIN,KAKUTEIKUBUN,KIKAIMEISHOU,BUHINMEISHOU,CHUUBUNSHONO,SEISAKUSUU,TANTOUSHA,KOUJIKANRIBANGOU,SHUKKANO,JPYGOUKEIKINGAKU,RMBGOUKEIKINGAKU,USDGOUKEIKINGAKU,CHUUBUNSHOMEISAINO,CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}