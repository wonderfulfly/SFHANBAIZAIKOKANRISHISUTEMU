package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008M6grdB8SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008M6grdB8SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A008M6grdB8SmartSearchDao
 * @version

 */

@Repository
public class A008M6grdB8SmartSearchDao {
	@Autowired
	private A008M6grdB8SmartSearchMapper A008M6grdB8SmartSearchMapper;

   
	public List<A008M6grdB8SmartSearchEntity> A008M6grdB8SmartSearch (String KYAKUSAKI, String MINYUUKIN, String CHUUMONHIDZUKE) throws Exception {

		List<A008M6grdB8SmartSearchEntity> returnVal = A008M6grdB8SmartSearchMapper.A008M6grdB8SmartSearch(KYAKUSAKI,MINYUUKIN,CHUUMONHIDZUKE);
		return returnVal;
	}
}