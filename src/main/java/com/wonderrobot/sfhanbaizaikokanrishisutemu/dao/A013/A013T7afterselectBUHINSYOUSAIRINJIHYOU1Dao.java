package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao
 * @version

 */

@Repository
public class A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao {
	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper;

   
	public List<A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity> A013T7afterselectBUHINSYOUSAIRINJIHYOU1 (String NOROGUINIDTOITCHISURU) throws Exception {

		List<A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity> returnVal = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper.A013T7afterselectBUHINSYOUSAIRINJIHYOU1(NOROGUINIDTOITCHISURU);
		return returnVal;
	}
}