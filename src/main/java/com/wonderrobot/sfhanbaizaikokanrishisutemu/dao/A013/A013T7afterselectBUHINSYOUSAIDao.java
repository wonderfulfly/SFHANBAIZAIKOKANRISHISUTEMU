package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013T7afterselectBUHINSYOUSAIDao {
	@Autowired
	private A013T7afterselectBUHINSYOUSAIMapper A013T7afterselectBUHINSYOUSAIMapper;

   
	public List<Double> A013T7afterselectBUHINSYOUSAI (String ay9_BUHINSYOUSAIRINJIHYOU_HINMEI) throws Exception {

		List<Double> returnVal = A013T7afterselectBUHINSYOUSAIMapper.A013T7afterselectBUHINSYOUSAI(ay9_BUHINSYOUSAIRINJIHYOU_HINMEI);
		return returnVal;
	}
}