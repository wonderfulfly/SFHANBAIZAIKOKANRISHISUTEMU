package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011Update95GridSaveMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011Update95GridSaveDao
 * @version

 */

@Repository
public class A011Update95GridSaveDao {
	@Autowired
	private A011Update95GridSaveMapper A011Update95GridSaveMapper;

   
	public int A011Update95GridSaveData (String KUBUN, String KOUMOKU, String SUURYOU, String HANBAITANKA, String KAHEI, String HANBAIKINGAKU, String TSUKAMATSUNYUUKINGAKUJPY, String TSUKAMATSUNYUUKINGAKURMB, String TSUKAMATSUNYUUKINGAKUUSD, String SHUKKOFURAGU, String CHUUBUNSHONO, String CHUUBUNSHOMEISAINO, String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1) throws Exception {

		int returnVal = A011Update95GridSaveMapper.A011Update95GridSaveData(KUBUN,KOUMOKU,SUURYOU,HANBAITANKA,KAHEI,HANBAIKINGAKU,TSUKAMATSUNYUUKINGAKUJPY,TSUKAMATSUNYUUKINGAKURMB,TSUKAMATSUNYUUKINGAKUUSD,SHUKKOFURAGU,CHUUBUNSHONO,CHUUBUNSHOMEISAINO,CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1);
		return returnVal;
	}
}