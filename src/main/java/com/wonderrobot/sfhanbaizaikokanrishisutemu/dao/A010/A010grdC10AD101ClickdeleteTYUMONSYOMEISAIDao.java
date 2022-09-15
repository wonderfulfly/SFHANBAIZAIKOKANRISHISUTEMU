package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteTYUMONSYOMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteTYUMONSYOMEISAIDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteTYUMONSYOMEISAIDao {
	@Autowired
	private A010grdC10AD101ClickdeleteTYUMONSYOMEISAIMapper A010grdC10AD101ClickdeleteTYUMONSYOMEISAIMapper;

   
	public int A010grdC10AD101ClickdeleteTYUMONSYOMEISAI (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteTYUMONSYOMEISAIMapper.A010grdC10AD101ClickdeleteTYUMONSYOMEISAI(CHUUBUNSHONO);
		return returnVal;
	}
}