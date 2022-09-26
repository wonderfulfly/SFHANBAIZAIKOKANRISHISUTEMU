package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DropDownListOption55KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010DropDownListOption55KAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A010DropDownListOption55KAISYADao
 * @version

 */

@Repository
public class A010DropDownListOption55KAISYADao {
	@Autowired
	private A010DropDownListOption55KAISYAMapper A010DropDownListOption55KAISYAMapper;

   
	public List<A010DropDownListOption55KAISYAEntity> KAISYA55KAISHAIDKAISHAMEIdrp () throws Exception {

		List<A010DropDownListOption55KAISYAEntity> returnVal = A010DropDownListOption55KAISYAMapper.KAISYA55KAISHAIDKAISHAMEIdrp();
		return returnVal;
	}
}