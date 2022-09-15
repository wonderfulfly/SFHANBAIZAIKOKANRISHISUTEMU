package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TANTOUSHASYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011TANTOUSHASYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011TANTOUSHASYAINDao
 * @version

 */

@Repository
public class A011TANTOUSHASYAINDao {
	@Autowired
	private A011TANTOUSHASYAINMapper A011TANTOUSHASYAINMapper;

   
	public List<A011TANTOUSHASYAINEntity> A011TANTOUSHAdrp () throws Exception {

		List<A011TANTOUSHASYAINEntity> returnVal = A011TANTOUSHASYAINMapper.A011TANTOUSHAdrp();
		return returnVal;
	}
}