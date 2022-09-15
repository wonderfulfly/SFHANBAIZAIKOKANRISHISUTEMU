package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUDao {
	@Autowired
	private A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUMapper A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUMapper;

   
	public int A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOU (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUMapper.A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOU(CHUUBUNSHONO);
		return returnVal;
	}
}