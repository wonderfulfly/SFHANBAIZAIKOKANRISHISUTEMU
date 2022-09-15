package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007TSUKAMATSUNYUUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007TSUKAMATSUNYUUSAKIKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007TSUKAMATSUNYUUSAKIKAISYADao
 * @version

 */

@Repository
public class A007TSUKAMATSUNYUUSAKIKAISYADao {
	@Autowired
	private A007TSUKAMATSUNYUUSAKIKAISYAMapper A007TSUKAMATSUNYUUSAKIKAISYAMapper;

   
	public List<A007TSUKAMATSUNYUUSAKIKAISYAEntity> A007TSUKAMATSUNYUUSAKIdrp () throws Exception {

		List<A007TSUKAMATSUNYUUSAKIKAISYAEntity> returnVal = A007TSUKAMATSUNYUUSAKIKAISYAMapper.A007TSUKAMATSUNYUUSAKIdrp();
		return returnVal;
	}
}