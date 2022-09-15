package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIRINJIHYOUDao
 * @version

 */

@Repository
public class A013T7afterselectBUHINSYOUSAIRINJIHYOUDao {
	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper;

   
	public List<A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity> A013T7afterselectBUHINSYOUSAIRINJIHYOU (String ROGUINID) throws Exception {

		List<A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity> returnVal = A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper.A013T7afterselectBUHINSYOUSAIRINJIHYOU(ROGUINID);
		return returnVal;
	}
}