package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU4Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickselectZAIKOU4Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickselectZAIKOU4Dao
 * @version

 */

@Repository
public class A011W41ClickselectZAIKOU4Dao {
	@Autowired
	private A011W41ClickselectZAIKOU4Mapper A011W41ClickselectZAIKOU4Mapper;

   
	public List<A011W41ClickselectZAIKOU4Entity> A011W41ClickselectZAIKOU4 (String CHUUBUNSHONO1) throws Exception {

		List<A011W41ClickselectZAIKOU4Entity> returnVal = A011W41ClickselectZAIKOU4Mapper.A011W41ClickselectZAIKOU4(CHUUBUNSHONO1);
		return returnVal;
	}
}