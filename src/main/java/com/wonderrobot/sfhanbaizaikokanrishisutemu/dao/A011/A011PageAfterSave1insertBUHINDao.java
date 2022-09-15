package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1insertBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1insertBUHINDao
 * @version

 */

@Repository
public class A011PageAfterSave1insertBUHINDao {
	@Autowired
	private A011PageAfterSave1insertBUHINMapper A011PageAfterSave1insertBUHINMapper;

   
	public int A011PageAfterSave1insertBUHIN (String ay6_TYUMONSYO_CHUUBUNSHONO, String ay6_TYUMONSYO_SHANAIKOUJIBANGOU, String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = A011PageAfterSave1insertBUHINMapper.A011PageAfterSave1insertBUHIN(ay6_TYUMONSYO_CHUUBUNSHONO,ay6_TYUMONSYO_SHANAIKOUJIBANGOU,ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
		return returnVal;
	}
}