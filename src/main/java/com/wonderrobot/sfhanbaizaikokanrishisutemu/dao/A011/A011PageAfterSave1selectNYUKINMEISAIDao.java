package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectNYUKINMEISAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectNYUKINMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectNYUKINMEISAIDao
 * @version

 */

@Repository
public class A011PageAfterSave1selectNYUKINMEISAIDao {
	@Autowired
	private A011PageAfterSave1selectNYUKINMEISAIMapper A011PageAfterSave1selectNYUKINMEISAIMapper;

   
	public List<A011PageAfterSave1selectNYUKINMEISAIEntity> A011PageAfterSave1selectNYUKINMEISAI (String ay2_TYUMONSYO_RESHIITONO) throws Exception {

		List<A011PageAfterSave1selectNYUKINMEISAIEntity> returnVal = A011PageAfterSave1selectNYUKINMEISAIMapper.A011PageAfterSave1selectNYUKINMEISAI(ay2_TYUMONSYO_RESHIITONO);
		return returnVal;
	}
}