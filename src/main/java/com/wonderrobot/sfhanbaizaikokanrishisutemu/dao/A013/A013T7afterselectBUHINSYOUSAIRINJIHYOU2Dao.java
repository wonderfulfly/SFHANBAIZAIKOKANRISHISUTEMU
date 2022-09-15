package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU2Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIRINJIHYOU2Dao
 * @version

 */

@Repository
public class A013T7afterselectBUHINSYOUSAIRINJIHYOU2Dao {
	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOU2Mapper A013T7afterselectBUHINSYOUSAIRINJIHYOU2Mapper;

   
	public List<A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity> A013T7afterselectBUHINSYOUSAIRINJIHYOU2 (String ROGUINID_RUUPUKAISHI_) throws Exception {

		List<A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity> returnVal = A013T7afterselectBUHINSYOUSAIRINJIHYOU2Mapper.A013T7afterselectBUHINSYOUSAIRINJIHYOU2(ROGUINID_RUUPUKAISHI_);
		return returnVal;
	}
}