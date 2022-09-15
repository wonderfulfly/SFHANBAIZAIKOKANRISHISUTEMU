package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C14deleteKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A005C14deleteKAISYADao
 * @version

 */

@Repository
public class A005C14deleteKAISYADao {
	@Autowired
	private A005C14deleteKAISYAMapper A005C14deleteKAISYAMapper;

   
	public int A005C14deleteKAISYA () throws Exception {

		int returnVal = A005C14deleteKAISYAMapper.A005C14deleteKAISYA();
		return returnVal;
	}
}