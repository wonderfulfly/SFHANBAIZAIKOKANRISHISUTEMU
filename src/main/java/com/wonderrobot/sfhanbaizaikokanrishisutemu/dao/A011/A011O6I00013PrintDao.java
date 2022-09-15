package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011O6I00013PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011O6I00013PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A011O6I00013PrintDao
 * @version

 */

@Repository
public class A011O6I00013PrintDao {
	@Autowired
	private A011O6I00013PrintMapper A011O6I00013PrintMapper;

   
	public List<A011O6I00013PrintEntity> A011O6I00013Print (String KYAKUSAKIMEISHOU, String CHUUMONHIDZUKE1) throws Exception {

		List<A011O6I00013PrintEntity> returnVal = A011O6I00013PrintMapper.A011O6I00013Print(KYAKUSAKIMEISHOU,CHUUMONHIDZUKE1);
		return returnVal;
	}
}