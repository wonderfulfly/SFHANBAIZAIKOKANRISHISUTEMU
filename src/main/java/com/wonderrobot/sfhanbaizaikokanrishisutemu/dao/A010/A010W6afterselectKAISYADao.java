package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectKAISYADao
 * @version

 */

@Repository
public class A010W6afterselectKAISYADao {
	@Autowired
	private A010W6afterselectKAISYAMapper A010W6afterselectKAISYAMapper;

   
	public List<A010W6afterselectKAISYAEntity> A010W6afterselectKAISYA (String MITUMORIRINJIHYOU_KYAKUSAKI) throws Exception {

		List<A010W6afterselectKAISYAEntity> returnVal = A010W6afterselectKAISYAMapper.A010W6afterselectKAISYA(MITUMORIRINJIHYOU_KYAKUSAKI);
		return returnVal;
	}
}