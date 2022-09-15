package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteBUHINSYOUSAIDao {
	@Autowired
	private A010grdC10AD101ClickdeleteBUHINSYOUSAIMapper A010grdC10AD101ClickdeleteBUHINSYOUSAIMapper;

   
	public int A010grdC10AD101ClickdeleteBUHINSYOUSAI (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteBUHINSYOUSAIMapper.A010grdC10AD101ClickdeleteBUHINSYOUSAI(CHUUBUNSHONO);
		return returnVal;
	}
}