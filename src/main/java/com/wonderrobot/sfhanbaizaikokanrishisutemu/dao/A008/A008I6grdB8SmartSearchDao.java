package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008I6grdB8SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008I6grdB8SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A008I6grdB8SmartSearchDao
 * @version

 */

@Repository
public class A008I6grdB8SmartSearchDao {
	@Autowired
	private A008I6grdB8SmartSearchMapper A008I6grdB8SmartSearchMapper;

   
	public List<A008I6grdB8SmartSearchEntity> A008I6grdB8SmartSearch (String KYAKUSAKI, String CHUUMONHIDZUKE) throws Exception {

		List<A008I6grdB8SmartSearchEntity> returnVal = A008I6grdB8SmartSearchMapper.A008I6grdB8SmartSearch(KYAKUSAKI,CHUUMONHIDZUKE);
		return returnVal;
	}
}