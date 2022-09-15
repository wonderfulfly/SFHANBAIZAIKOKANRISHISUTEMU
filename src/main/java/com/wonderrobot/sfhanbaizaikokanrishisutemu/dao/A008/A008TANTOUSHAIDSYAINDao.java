package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008TANTOUSHAIDSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008TANTOUSHAIDSYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008TANTOUSHAIDSYAINDao
 * @version

 */

@Repository
public class A008TANTOUSHAIDSYAINDao {
	@Autowired
	private A008TANTOUSHAIDSYAINMapper A008TANTOUSHAIDSYAINMapper;

   
	public List<A008TANTOUSHAIDSYAINEntity> A008TANTOUSHAIDdrp () throws Exception {

		List<A008TANTOUSHAIDSYAINEntity> returnVal = A008TANTOUSHAIDSYAINMapper.A008TANTOUSHAIDdrp();
		return returnVal;
	}
}