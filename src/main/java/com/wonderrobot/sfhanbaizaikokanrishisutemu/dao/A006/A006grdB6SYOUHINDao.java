package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006grdB6SYOUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006grdB6SYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006grdB6SYOUHINDao
 * @version

 */

@Repository
public class A006grdB6SYOUHINDao {
	@Autowired
	private A006grdB6SYOUHINMapper A006grdB6SYOUHINMapper;

   
	public List<A006grdB6SYOUHINEntity> A006InitGrid () throws Exception {

		List<A006grdB6SYOUHINEntity> returnVal = A006grdB6SYOUHINMapper.A006InitGrid();
		return returnVal;
	}
}