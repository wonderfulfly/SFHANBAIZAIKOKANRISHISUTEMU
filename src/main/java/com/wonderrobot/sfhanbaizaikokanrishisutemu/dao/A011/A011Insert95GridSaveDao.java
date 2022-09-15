package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011Insert95GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Insert95GridSaveDao
 * @version

 */

@Repository
public class A011Insert95GridSaveDao {
	@Autowired
	private A011Insert95GridSaveMapper A011Insert95GridSaveMapper;

   
	public int A011Insert95GridSaveData (String KUBUN, String KOUMOKU, String SUURYOU, String HANBAITANKA, String KAHEI, String HANBAIKINGAKU, String TSUKAMATSUNYUUKINGAKUJPY, String TSUKAMATSUNYUUKINGAKURMB, String TSUKAMATSUNYUUKINGAKUUSD, String SHUKKOFURAGU, String CHUUBUNSHONO, String CHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = A011Insert95GridSaveMapper.A011Insert95GridSaveData(KUBUN,KOUMOKU,SUURYOU,HANBAITANKA,KAHEI,HANBAIKINGAKU,TSUKAMATSUNYUUKINGAKUJPY,TSUKAMATSUNYUUKINGAKURMB,TSUKAMATSUNYUUKINGAKUUSD,SHUKKOFURAGU,CHUUBUNSHONO,CHUUBUNSHOMEISAINO);
		return returnVal;
	}
}