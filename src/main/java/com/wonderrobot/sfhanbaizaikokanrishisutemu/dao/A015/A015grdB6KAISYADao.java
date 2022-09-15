package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015grdB6KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A015.A015grdB6KAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A015grdB6KAISYADao
 * @version

 */

@Repository
public class A015grdB6KAISYADao {
	@Autowired
	private A015grdB6KAISYAMapper A015grdB6KAISYAMapper;

   
	public List<A015grdB6KAISYAEntity> A015InitGrid () throws Exception {

		List<A015grdB6KAISYAEntity> returnVal = A015grdB6KAISYAMapper.A015InitGrid();
		return returnVal;
	}
}