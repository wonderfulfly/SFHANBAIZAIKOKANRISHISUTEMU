package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickdeleteSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickdeleteSYOUHINDao
 * @version

 */

@Repository
public class A013grdB16AC161ClickdeleteSYOUHINDao {
	@Autowired
	private A013grdB16AC161ClickdeleteSYOUHINMapper A013grdB16AC161ClickdeleteSYOUHINMapper;

   
	public int A013grdB16AC161ClickdeleteSYOUHIN (String KETSUGOUMOJI2) throws Exception {

		int returnVal = A013grdB16AC161ClickdeleteSYOUHINMapper.A013grdB16AC161ClickdeleteSYOUHIN(KETSUGOUMOJI2);
		return returnVal;
	}
}