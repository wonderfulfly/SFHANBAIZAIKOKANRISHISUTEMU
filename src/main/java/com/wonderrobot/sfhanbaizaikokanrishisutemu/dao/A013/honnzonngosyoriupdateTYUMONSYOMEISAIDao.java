package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriupdateTYUMONSYOMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriupdateTYUMONSYOMEISAIDao
 * @version

 */

@Repository
public class honnzonngosyoriupdateTYUMONSYOMEISAIDao {
	@Autowired
	private honnzonngosyoriupdateTYUMONSYOMEISAIMapper honnzonngosyoriupdateTYUMONSYOMEISAIMapper;

   
	public int honnzonngosyoriupdateTYUMONSYOMEISAI (double JPYGOUKEI1, double RMBGOUKEI1, double USDGOUKEI1, String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = honnzonngosyoriupdateTYUMONSYOMEISAIMapper.honnzonngosyoriupdateTYUMONSYOMEISAI(JPYGOUKEI1,RMBGOUKEI1,USDGOUKEI1,BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}