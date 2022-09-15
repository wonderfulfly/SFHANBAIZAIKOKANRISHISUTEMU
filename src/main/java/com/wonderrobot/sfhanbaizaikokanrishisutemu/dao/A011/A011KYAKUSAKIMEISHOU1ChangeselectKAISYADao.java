package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao
 * @version

 */

@Repository
public class A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao {
	@Autowired
	private A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper;

   
	public List<A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity> A011KYAKUSAKIMEISHOU1ChangeselectKAISYA (String KYAKUSAKIMEISHOU) throws Exception {

		List<A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity> returnVal = A011KYAKUSAKIMEISHOU1ChangeselectKAISYAMapper.A011KYAKUSAKIMEISHOU1ChangeselectKAISYA(KYAKUSAKIMEISHOU);
		return returnVal;
	}
}