package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C9insertBUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A005C9insertBUMONDao
 * @version

 */

@Repository
public class A005C9insertBUMONDao {
	@Autowired
	private A005C9insertBUMONMapper A005C9insertBUMONMapper;

   
	public int A005C9insertBUMON (String BUMONID, String BUMONMEI) throws Exception {

		int returnVal = A005C9insertBUMONMapper.A005C9insertBUMON(BUMONID,BUMONMEI);
		return returnVal;
	}
}