package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009grdB8NYUKINMEISAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009grdB8NYUKINMEISAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009grdB8NYUKINMEISAIDao
 * @version

 */

@Repository
public class A009grdB8NYUKINMEISAIDao {
	@Autowired
	private A009grdB8NYUKINMEISAIMapper A009grdB8NYUKINMEISAIMapper;

   
	public List<A009grdB8NYUKINMEISAIEntity> A009InitGrid (String RYOUSHUUSHONO) throws Exception {

		List<A009grdB8NYUKINMEISAIEntity> returnVal = A009grdB8NYUKINMEISAIMapper.A009InitGrid(RYOUSHUUSHONO);
		return returnVal;
	}
}