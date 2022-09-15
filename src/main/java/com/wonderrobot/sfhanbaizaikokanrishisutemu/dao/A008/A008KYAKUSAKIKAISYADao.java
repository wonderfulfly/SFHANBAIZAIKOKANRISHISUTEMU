package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008KYAKUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008KYAKUSAKIKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008KYAKUSAKIKAISYADao
 * @version

 */

@Repository
public class A008KYAKUSAKIKAISYADao {
	@Autowired
	private A008KYAKUSAKIKAISYAMapper A008KYAKUSAKIKAISYAMapper;

   
	public List<A008KYAKUSAKIKAISYAEntity> A008KYAKUSAKIdrp () throws Exception {

		List<A008KYAKUSAKIKAISYAEntity> returnVal = A008KYAKUSAKIKAISYAMapper.A008KYAKUSAKIdrp();
		return returnVal;
	}
}