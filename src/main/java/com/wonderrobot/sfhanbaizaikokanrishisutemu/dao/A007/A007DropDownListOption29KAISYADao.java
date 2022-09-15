package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007DropDownListOption29KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007DropDownListOption29KAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A007DropDownListOption29KAISYADao
 * @version

 */

@Repository
public class A007DropDownListOption29KAISYADao {
	@Autowired
	private A007DropDownListOption29KAISYAMapper A007DropDownListOption29KAISYAMapper;

   
	public List<A007DropDownListOption29KAISYAEntity> KAISYA29KAISHAIDKAISHAMEIdrp () throws Exception {

		List<A007DropDownListOption29KAISYAEntity> returnVal = A007DropDownListOption29KAISYAMapper.KAISYA29KAISHAIDKAISHAMEIdrp();
		return returnVal;
	}
}