package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007Y61ClickselectZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007Y61ClickselectZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007Y61ClickselectZAIKOUDao
 * @version

 */

@Repository
public class A007Y61ClickselectZAIKOUDao {
	@Autowired
	private A007Y61ClickselectZAIKOUMapper A007Y61ClickselectZAIKOUMapper;

   
	public List<A007Y61ClickselectZAIKOUEntity> A007Y61ClickselectZAIKOU (String CHUUBUNSHONO, String BUHINMEI, String ZAIKONO, String SHANAIKOUJIBANGOU) throws Exception {

		List<A007Y61ClickselectZAIKOUEntity> returnVal = A007Y61ClickselectZAIKOUMapper.A007Y61ClickselectZAIKOU(CHUUBUNSHONO,BUHINMEI,ZAIKONO,SHANAIKOUJIBANGOU);
		return returnVal;
	}
}