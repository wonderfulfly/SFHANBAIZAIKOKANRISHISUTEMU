package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7deleteBUHINSYOUSAIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A013T7deleteBUHINSYOUSAIRINJIHYOUDao
 * @version

 */

@Repository
public class A013T7deleteBUHINSYOUSAIRINJIHYOUDao {
	@Autowired
	private A013T7deleteBUHINSYOUSAIRINJIHYOUMapper A013T7deleteBUHINSYOUSAIRINJIHYOUMapper;

   
	public int A013T7deleteBUHINSYOUSAIRINJIHYOU () throws Exception {

		int returnVal = A013T7deleteBUHINSYOUSAIRINJIHYOUMapper.A013T7deleteBUHINSYOUSAIRINJIHYOU();
		return returnVal;
	}
}