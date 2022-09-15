package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010grdC10AD101ClickselectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickselectNYUKINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickselectNYUKINDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickselectNYUKINDao {
	@Autowired
	private A010grdC10AD101ClickselectNYUKINMapper A010grdC10AD101ClickselectNYUKINMapper;

   
	public List<A010grdC10AD101ClickselectNYUKINEntity> A010grdC10AD101ClickselectNYUKIN (String CHUUBUNSHONO) throws Exception {

		List<A010grdC10AD101ClickselectNYUKINEntity> returnVal = A010grdC10AD101ClickselectNYUKINMapper.A010grdC10AD101ClickselectNYUKIN(CHUUBUNSHONO);
		return returnVal;
	}
}