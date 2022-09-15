package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001SYAINDao
 * @version

 */

@Repository
public class A001SYAINDao {
	@Autowired
	private A001SYAINMapper A001SYAINMapper;

   
	public List<A001SYAINEntity> A001InitDepthZero (String SHAINID1, String ROGUINID1) throws Exception {

		List<A001SYAINEntity> returnVal = A001SYAINMapper.A001InitDepthZero(SHAINID1,ROGUINID1);
		return returnVal;
	}
}