package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009KYAKUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009KYAKUSAKIKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009KYAKUSAKIKAISYADao
 * @version

 */

@Repository
public class A009KYAKUSAKIKAISYADao {
	@Autowired
	private A009KYAKUSAKIKAISYAMapper A009KYAKUSAKIKAISYAMapper;

   
	public List<A009KYAKUSAKIKAISYAEntity> A009KYAKUSAKIdrp () throws Exception {

		List<A009KYAKUSAKIKAISYAEntity> returnVal = A009KYAKUSAKIKAISYAMapper.A009KYAKUSAKIdrp();
		return returnVal;
	}
}