package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOUKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011KYAKUSAKIMEISHOUKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011KYAKUSAKIMEISHOUKAISYADao
 * @version

 */

@Repository
public class A011KYAKUSAKIMEISHOUKAISYADao {
	@Autowired
	private A011KYAKUSAKIMEISHOUKAISYAMapper A011KYAKUSAKIMEISHOUKAISYAMapper;

   
	public List<A011KYAKUSAKIMEISHOUKAISYAEntity> A011KYAKUSAKIMEISHOUdrp () throws Exception {

		List<A011KYAKUSAKIMEISHOUKAISYAEntity> returnVal = A011KYAKUSAKIMEISHOUKAISYAMapper.A011KYAKUSAKIMEISHOUdrp();
		return returnVal;
	}
}