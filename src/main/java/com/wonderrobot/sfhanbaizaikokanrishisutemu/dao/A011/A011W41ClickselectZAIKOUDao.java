package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickselectZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickselectZAIKOUDao
 * @version

 */

@Repository
public class A011W41ClickselectZAIKOUDao {
	@Autowired
	private A011W41ClickselectZAIKOUMapper A011W41ClickselectZAIKOUMapper;

   
	public List<A011W41ClickselectZAIKOUEntity> A011W41ClickselectZAIKOU (String CHUUBUNSHONO1) throws Exception {

		List<A011W41ClickselectZAIKOUEntity> returnVal = A011W41ClickselectZAIKOUMapper.A011W41ClickselectZAIKOU(CHUUBUNSHONO1);
		return returnVal;
	}
}