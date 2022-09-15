package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteNYUKINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteNYUKINDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteNYUKINDao {
	@Autowired
	private A010grdC10AD101ClickdeleteNYUKINMapper A010grdC10AD101ClickdeleteNYUKINMapper;

   
	public int A010grdC10AD101ClickdeleteNYUKIN (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteNYUKINMapper.A010grdC10AD101ClickdeleteNYUKIN(CHUUBUNSHONO);
		return returnVal;
	}
}