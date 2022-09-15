package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectSYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectSYAINDao
 * @version

 */

@Repository
public class A013T7afterselectSYAINDao {
	@Autowired
	private A013T7afterselectSYAINMapper A013T7afterselectSYAINMapper;

   
	public List<A013T7afterselectSYAINEntity> A013T7afterselectSYAIN (String ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA) throws Exception {

		List<A013T7afterselectSYAINEntity> returnVal = A013T7afterselectSYAINMapper.A013T7afterselectSYAIN(ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA);
		return returnVal;
	}
}