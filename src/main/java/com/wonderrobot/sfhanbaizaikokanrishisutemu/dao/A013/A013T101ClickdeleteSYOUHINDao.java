package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickdeleteSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickdeleteSYOUHINDao
 * @version

 */

@Repository
public class A013T101ClickdeleteSYOUHINDao {
	@Autowired
	private A013T101ClickdeleteSYOUHINMapper A013T101ClickdeleteSYOUHINMapper;

   
	public int A013T101ClickdeleteSYOUHIN () throws Exception {

		int returnVal = A013T101ClickdeleteSYOUHINMapper.A013T101ClickdeleteSYOUHIN();
		return returnVal;
	}
}