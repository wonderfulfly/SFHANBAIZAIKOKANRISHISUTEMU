package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002grdB6SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002grdB6SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002grdB6SYAINDao
 * @version

 */

@Repository
public class A002grdB6SYAINDao {
	@Autowired
	private A002grdB6SYAINMapper A002grdB6SYAINMapper;

   
	public List<A002grdB6SYAINEntity> A002InitGrid () throws Exception {

		List<A002grdB6SYAINEntity> returnVal = A002grdB6SYAINMapper.A002InitGrid();
		return returnVal;
	}
}