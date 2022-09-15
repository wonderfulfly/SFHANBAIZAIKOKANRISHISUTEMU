package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013TANTOUSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013TANTOUSYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013TANTOUSYAINDao
 * @version

 */

@Repository
public class A013TANTOUSYAINDao {
	@Autowired
	private A013TANTOUSYAINMapper A013TANTOUSYAINMapper;

   
	public List<A013TANTOUSYAINEntity> A013TANTOUdrp () throws Exception {

		List<A013TANTOUSYAINEntity> returnVal = A013TANTOUSYAINMapper.A013TANTOUdrp();
		return returnVal;
	}
}