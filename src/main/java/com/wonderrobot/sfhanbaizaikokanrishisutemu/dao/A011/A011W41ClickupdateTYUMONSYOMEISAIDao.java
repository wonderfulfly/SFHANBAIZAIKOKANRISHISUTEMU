package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateTYUMONSYOMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateTYUMONSYOMEISAIDao
 * @version

 */

@Repository
public class A011W41ClickupdateTYUMONSYOMEISAIDao {
	@Autowired
	private A011W41ClickupdateTYUMONSYOMEISAIMapper A011W41ClickupdateTYUMONSYOMEISAIMapper;

   
	public int A011W41ClickupdateTYUMONSYOMEISAI (String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011W41ClickupdateTYUMONSYOMEISAIMapper.A011W41ClickupdateTYUMONSYOMEISAI(CHUUBUNSHONO1);
		return returnVal;
	}
}