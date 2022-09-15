package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteBUHINDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteBUHINDao {
	@Autowired
	private A010grdC10AD101ClickdeleteBUHINMapper A010grdC10AD101ClickdeleteBUHINMapper;

   
	public int A010grdC10AD101ClickdeleteBUHIN (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteBUHINMapper.A010grdC10AD101ClickdeleteBUHIN(CHUUBUNSHONO);
		return returnVal;
	}
}