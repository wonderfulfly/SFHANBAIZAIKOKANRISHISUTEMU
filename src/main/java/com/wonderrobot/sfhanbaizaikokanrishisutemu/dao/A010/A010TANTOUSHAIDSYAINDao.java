package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TANTOUSHAIDSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010TANTOUSHAIDSYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010TANTOUSHAIDSYAINDao
 * @version

 */

@Repository
public class A010TANTOUSHAIDSYAINDao {
	@Autowired
	private A010TANTOUSHAIDSYAINMapper A010TANTOUSHAIDSYAINMapper;

   
	public List<A010TANTOUSHAIDSYAINEntity> A010TANTOUSHAIDdrp () throws Exception {

		List<A010TANTOUSHAIDSYAINEntity> returnVal = A010TANTOUSHAIDSYAINMapper.A010TANTOUSHAIDdrp();
		return returnVal;
	}
}