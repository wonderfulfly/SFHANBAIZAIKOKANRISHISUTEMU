package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010KYAKUSAKIID1KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010KYAKUSAKIID1KAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010KYAKUSAKIID1KAISYADao
 * @version

 */

@Repository
public class A010KYAKUSAKIID1KAISYADao {
	@Autowired
	private A010KYAKUSAKIID1KAISYAMapper A010KYAKUSAKIID1KAISYAMapper;

   
	public List<A010KYAKUSAKIID1KAISYAEntity> A010KYAKUSAKIID1drp () throws Exception {

		List<A010KYAKUSAKIID1KAISYAEntity> returnVal = A010KYAKUSAKIID1KAISYAMapper.A010KYAKUSAKIID1drp();
		return returnVal;
	}
}