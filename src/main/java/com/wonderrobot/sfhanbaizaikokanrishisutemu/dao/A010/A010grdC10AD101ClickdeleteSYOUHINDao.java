package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteSYOUHINDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteSYOUHINDao {
	@Autowired
	private A010grdC10AD101ClickdeleteSYOUHINMapper A010grdC10AD101ClickdeleteSYOUHINMapper;

   
	public int A010grdC10AD101ClickdeleteSYOUHIN (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteSYOUHINMapper.A010grdC10AD101ClickdeleteSYOUHIN(CHUUBUNSHONO);
		return returnVal;
	}
}