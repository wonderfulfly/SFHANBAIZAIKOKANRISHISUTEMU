package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004O14deleteKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A004O14deleteKAISYADao
 * @version

 */

@Repository
public class A004O14deleteKAISYADao {
	@Autowired
	private A004O14deleteKAISYAMapper A004O14deleteKAISYAMapper;

   
	public int A004O14deleteKAISYA () throws Exception {

		int returnVal = A004O14deleteKAISYAMapper.A004O14deleteKAISYA();
		return returnVal;
	}
}