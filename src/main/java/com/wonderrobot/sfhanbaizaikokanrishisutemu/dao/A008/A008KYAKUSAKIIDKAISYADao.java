package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008KYAKUSAKIIDKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008KYAKUSAKIIDKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008KYAKUSAKIIDKAISYADao
 * @version

 */

@Repository
public class A008KYAKUSAKIIDKAISYADao {
	@Autowired
	private A008KYAKUSAKIIDKAISYAMapper A008KYAKUSAKIIDKAISYAMapper;

   
	public List<A008KYAKUSAKIIDKAISYAEntity> A008KYAKUSAKIIDdrp () throws Exception {

		List<A008KYAKUSAKIIDKAISYAEntity> returnVal = A008KYAKUSAKIIDKAISYAMapper.A008KYAKUSAKIIDdrp();
		return returnVal;
	}
}