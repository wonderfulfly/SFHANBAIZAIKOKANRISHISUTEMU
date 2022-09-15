package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W61ClickselectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W61ClickselectNYUKINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W61ClickselectNYUKINDao
 * @version

 */

@Repository
public class A011W61ClickselectNYUKINDao {
	@Autowired
	private A011W61ClickselectNYUKINMapper A011W61ClickselectNYUKINMapper;

   
	public List<A011W61ClickselectNYUKINEntity> A011W61ClickselectNYUKIN (String CHUUBUNSHONO1) throws Exception {

		List<A011W61ClickselectNYUKINEntity> returnVal = A011W61ClickselectNYUKINMapper.A011W61ClickselectNYUKIN(CHUUBUNSHONO1);
		return returnVal;
	}
}