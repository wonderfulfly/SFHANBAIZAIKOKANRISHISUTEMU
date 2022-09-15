package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013InsertSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013InsertSaveDao
 * @version

 */

@Repository
public class A013InsertSaveDao {
	@Autowired
	private A013InsertSaveMapper A013InsertSaveMapper;

   
	public int A013InsertSaveData (String TOKUISAKI, String MAISUU, String ASENBURIRAIN, String KAKUTEIKUBUN, String KIKAIMEISHOU, String BUHINMEISHOU, String CHUUBUNSHONO, String SEISAKUSUU, String TANTOUSHA, String KOUJIKANRIBANGOU, String SHUKKANO, String JPYGOUKEIKINGAKU, String RMBGOUKEIKINGAKU, String USDGOUKEIKINGAKU, String CHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = A013InsertSaveMapper.A013InsertSaveData(TOKUISAKI,MAISUU,ASENBURIRAIN,KAKUTEIKUBUN,KIKAIMEISHOU,BUHINMEISHOU,CHUUBUNSHONO,SEISAKUSUU,TANTOUSHA,KOUJIKANRIBANGOU,SHUKKANO,JPYGOUKEIKINGAKU,RMBGOUKEIKINGAKU,USDGOUKEIKINGAKU,CHUUBUNSHOMEISAINO);
		return returnVal;
	}
}