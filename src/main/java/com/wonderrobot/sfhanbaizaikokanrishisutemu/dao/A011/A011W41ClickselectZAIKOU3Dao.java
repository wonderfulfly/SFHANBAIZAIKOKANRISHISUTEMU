package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU3Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickselectZAIKOU3Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickselectZAIKOU3Dao
 * @version

 */

@Repository
public class A011W41ClickselectZAIKOU3Dao {
	@Autowired
	private A011W41ClickselectZAIKOU3Mapper A011W41ClickselectZAIKOU3Mapper;

   
	public List<A011W41ClickselectZAIKOU3Entity> A011W41ClickselectZAIKOU3 (String CHUUBUNSHONO1) throws Exception {

		List<A011W41ClickselectZAIKOU3Entity> returnVal = A011W41ClickselectZAIKOU3Mapper.A011W41ClickselectZAIKOU3(CHUUBUNSHONO1);
		return returnVal;
	}
}