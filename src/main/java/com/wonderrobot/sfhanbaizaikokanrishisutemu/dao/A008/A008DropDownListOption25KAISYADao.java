package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DropDownListOption25KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008DropDownListOption25KAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A008DropDownListOption25KAISYADao
 * @version

 */

@Repository
public class A008DropDownListOption25KAISYADao {
	@Autowired
	private A008DropDownListOption25KAISYAMapper A008DropDownListOption25KAISYAMapper;

   
	public List<A008DropDownListOption25KAISYAEntity> KAISYA25KAISHAIDKAISHAMEIdrp () throws Exception {

		List<A008DropDownListOption25KAISYAEntity> returnVal = A008DropDownListOption25KAISYAMapper.KAISYA25KAISHAIDKAISHAMEIdrp();
		return returnVal;
	}
}