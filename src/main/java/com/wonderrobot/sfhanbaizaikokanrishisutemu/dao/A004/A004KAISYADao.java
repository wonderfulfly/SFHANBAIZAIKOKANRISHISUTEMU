package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004.A004KAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004KAISYADao
 * @version

 */

@Repository
public class A004KAISYADao {
	@Autowired
	private A004KAISYAMapper A004KAISYAMapper;

   
	public List<A004KAISYAEntity> A004InitDepthZero (String KAISHAID1) throws Exception {

		List<A004KAISYAEntity> returnVal = A004KAISYAMapper.A004InitDepthZero(KAISHAID1);
		return returnVal;
	}
}