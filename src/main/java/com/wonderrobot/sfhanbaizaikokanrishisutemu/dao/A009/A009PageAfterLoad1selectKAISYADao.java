package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterLoad1selectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009PageAfterLoad1selectKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterLoad1selectKAISYADao
 * @version

 */

@Repository
public class A009PageAfterLoad1selectKAISYADao {
	@Autowired
	private A009PageAfterLoad1selectKAISYAMapper A009PageAfterLoad1selectKAISYAMapper;

   
	public List<A009PageAfterLoad1selectKAISYAEntity> A009PageAfterLoad1selectKAISYA (String KYAKUSAKI) throws Exception {

		List<A009PageAfterLoad1selectKAISYAEntity> returnVal = A009PageAfterLoad1selectKAISYAMapper.A009PageAfterLoad1selectKAISYA(KYAKUSAKI);
		return returnVal;
	}
}