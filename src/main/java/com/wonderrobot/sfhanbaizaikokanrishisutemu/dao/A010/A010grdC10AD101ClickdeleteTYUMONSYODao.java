package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteTYUMONSYODao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteTYUMONSYODao {
	@Autowired
	private A010grdC10AD101ClickdeleteTYUMONSYOMapper A010grdC10AD101ClickdeleteTYUMONSYOMapper;

   
	public int A010grdC10AD101ClickdeleteTYUMONSYO (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteTYUMONSYOMapper.A010grdC10AD101ClickdeleteTYUMONSYO(CHUUBUNSHONO);
		return returnVal;
	}
}