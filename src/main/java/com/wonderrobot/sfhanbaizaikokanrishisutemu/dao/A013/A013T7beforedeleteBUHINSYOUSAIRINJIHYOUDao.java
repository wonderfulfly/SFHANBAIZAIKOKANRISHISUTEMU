package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7beforedeleteBUHINSYOUSAIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao
 * @version

 */

@Repository
public class A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao {
	@Autowired
	private A013T7beforedeleteBUHINSYOUSAIRINJIHYOUMapper A013T7beforedeleteBUHINSYOUSAIRINJIHYOUMapper;

   
	public int A013T7beforedeleteBUHINSYOUSAIRINJIHYOU (String ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU) throws Exception {

		int returnVal = A013T7beforedeleteBUHINSYOUSAIRINJIHYOUMapper.A013T7beforedeleteBUHINSYOUSAIRINJIHYOU(ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU);
		return returnVal;
	}
}