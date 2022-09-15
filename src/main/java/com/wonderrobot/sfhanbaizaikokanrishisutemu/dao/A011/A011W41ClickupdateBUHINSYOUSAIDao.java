package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A011W41ClickupdateBUHINSYOUSAIDao {
	@Autowired
	private A011W41ClickupdateBUHINSYOUSAIMapper A011W41ClickupdateBUHINSYOUSAIMapper;

   
	public int A011W41ClickupdateBUHINSYOUSAI (String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011W41ClickupdateBUHINSYOUSAIMapper.A011W41ClickupdateBUHINSYOUSAI(CHUUBUNSHONO1);
		return returnVal;
	}
}