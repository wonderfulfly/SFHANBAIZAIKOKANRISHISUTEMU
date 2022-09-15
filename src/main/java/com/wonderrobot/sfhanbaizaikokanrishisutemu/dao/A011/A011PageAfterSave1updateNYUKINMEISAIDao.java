package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1updateNYUKINMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1updateNYUKINMEISAIDao
 * @version

 */

@Repository
public class A011PageAfterSave1updateNYUKINMEISAIDao {
	@Autowired
	private A011PageAfterSave1updateNYUKINMEISAIMapper A011PageAfterSave1updateNYUKINMEISAIMapper;

   
	public int A011PageAfterSave1updateNYUKINMEISAI (double ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI, String ay3_NYUKINMEISAI_RESHIITOMEISAINO) throws Exception {

		int returnVal = A011PageAfterSave1updateNYUKINMEISAIMapper.A011PageAfterSave1updateNYUKINMEISAI(ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI,ay3_NYUKINMEISAI_RESHIITOMEISAINO);
		return returnVal;
	}
}