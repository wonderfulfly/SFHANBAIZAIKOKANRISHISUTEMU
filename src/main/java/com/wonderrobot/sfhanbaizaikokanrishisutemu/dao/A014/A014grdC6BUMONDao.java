package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014grdC6BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A014.A014grdC6BUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014grdC6BUMONDao
 * @version

 */

@Repository
public class A014grdC6BUMONDao {
	@Autowired
	private A014grdC6BUMONMapper A014grdC6BUMONMapper;

   
	public List<A014grdC6BUMONEntity> A014InitGrid () throws Exception {

		List<A014grdC6BUMONEntity> returnVal = A014grdC6BUMONMapper.A014InitGrid();
		return returnVal;
	}
}