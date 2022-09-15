package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18TYUMONSYOMEISAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011grdB18TYUMONSYOMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011grdB18TYUMONSYOMEISAIDao
 * @version

 */

@Repository
public class A011grdB18TYUMONSYOMEISAIDao {
	@Autowired
	private A011grdB18TYUMONSYOMEISAIMapper A011grdB18TYUMONSYOMEISAIMapper;

   
	public List<A011grdB18TYUMONSYOMEISAIEntity> A011InitGrid (String CHUUBUNSHONO1) throws Exception {

		List<A011grdB18TYUMONSYOMEISAIEntity> returnVal = A011grdB18TYUMONSYOMEISAIMapper.A011InitGrid(CHUUBUNSHONO1);
		return returnVal;
	}
}