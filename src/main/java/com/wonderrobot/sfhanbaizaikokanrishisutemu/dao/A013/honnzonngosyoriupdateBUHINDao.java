package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriupdateBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriupdateBUHINDao
 * @version

 */

@Repository
public class honnzonngosyoriupdateBUHINDao {
	@Autowired
	private honnzonngosyoriupdateBUHINMapper honnzonngosyoriupdateBUHINMapper;

   
	public int honnzonngosyoriupdateBUHIN (double JPYGOUKEI2, double RMBGOUKEI2, double USDGOUKEI2, String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1) throws Exception {

		int returnVal = honnzonngosyoriupdateBUHINMapper.honnzonngosyoriupdateBUHIN(JPYGOUKEI2,RMBGOUKEI2,USDGOUKEI2,BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}