package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009TANTOUSHASYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009TANTOUSHASYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009TANTOUSHASYAINDao
 * @version

 */

@Repository
public class A009TANTOUSHASYAINDao {
	@Autowired
	private A009TANTOUSHASYAINMapper A009TANTOUSHASYAINMapper;

   
	public List<A009TANTOUSHASYAINEntity> A009TANTOUSHAdrp () throws Exception {

		List<A009TANTOUSHASYAINEntity> returnVal = A009TANTOUSHASYAINMapper.A009TANTOUSHAdrp();
		return returnVal;
	}
}