package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C9deleteBUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A005C9deleteBUMONDao
 * @version

 */

@Repository
public class A005C9deleteBUMONDao {
	@Autowired
	private A005C9deleteBUMONMapper A005C9deleteBUMONMapper;

   
	public int A005C9deleteBUMON () throws Exception {

		int returnVal = A005C9deleteBUMONMapper.A005C9deleteBUMON();
		return returnVal;
	}
}