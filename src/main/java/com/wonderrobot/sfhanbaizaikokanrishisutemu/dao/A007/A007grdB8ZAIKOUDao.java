package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8ZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8ZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8ZAIKOUDao
 * @version

 */

@Repository
public class A007grdB8ZAIKOUDao {
	@Autowired
	private A007grdB8ZAIKOUMapper A007grdB8ZAIKOUMapper;

   
	public List<A007grdB8ZAIKOUEntity> A007InitGrid () throws Exception {

		List<A007grdB8ZAIKOUEntity> returnVal = A007grdB8ZAIKOUMapper.A007InitGrid();
		return returnVal;
	}
}