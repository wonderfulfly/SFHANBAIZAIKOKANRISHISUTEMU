package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010KYAKUSAKIIDKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010KYAKUSAKIIDKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010KYAKUSAKIIDKAISYADao
 * @version

 */

@Repository
public class A010KYAKUSAKIIDKAISYADao {
	@Autowired
	private A010KYAKUSAKIIDKAISYAMapper A010KYAKUSAKIIDKAISYAMapper;

   
	public List<A010KYAKUSAKIIDKAISYAEntity> A010KYAKUSAKIIDdrp () throws Exception {

		List<A010KYAKUSAKIIDKAISYAEntity> returnVal = A010KYAKUSAKIIDKAISYAMapper.A010KYAKUSAKIIDdrp();
		return returnVal;
	}
}