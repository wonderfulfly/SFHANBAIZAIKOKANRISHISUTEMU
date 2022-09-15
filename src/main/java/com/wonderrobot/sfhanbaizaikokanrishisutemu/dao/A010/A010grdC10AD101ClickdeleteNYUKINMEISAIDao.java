package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteNYUKINMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteNYUKINMEISAIDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteNYUKINMEISAIDao {
	@Autowired
	private A010grdC10AD101ClickdeleteNYUKINMEISAIMapper A010grdC10AD101ClickdeleteNYUKINMEISAIMapper;

   
	public int A010grdC10AD101ClickdeleteNYUKINMEISAI (String NYUKIN_RESHIITONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteNYUKINMEISAIMapper.A010grdC10AD101ClickdeleteNYUKINMEISAI(NYUKIN_RESHIITONO);
		return returnVal;
	}
}