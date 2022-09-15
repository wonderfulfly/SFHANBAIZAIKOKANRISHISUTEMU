package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteZAIKOUDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteZAIKOUDao {
	@Autowired
	private A010grdC10AD101ClickdeleteZAIKOUMapper A010grdC10AD101ClickdeleteZAIKOUMapper;

   
	public int A010grdC10AD101ClickdeleteZAIKOU (String CHUUBUNSHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteZAIKOUMapper.A010grdC10AD101ClickdeleteZAIKOU(CHUUBUNSHONO);
		return returnVal;
	}
}