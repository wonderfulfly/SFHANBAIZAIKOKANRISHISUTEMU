package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006S4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006S4grdB6SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A006S4grdB6SmartSearchDao
 * @version

 */

@Repository
public class A006S4grdB6SmartSearchDao {
	@Autowired
	private A006S4grdB6SmartSearchMapper A006S4grdB6SmartSearchMapper;

   
	public List<A006S4grdB6SmartSearchEntity> A006S4grdB6SmartSearch (String KAISHAMEI, String SHOUHINMEI) throws Exception {

		List<A006S4grdB6SmartSearchEntity> returnVal = A006S4grdB6SmartSearchMapper.A006S4grdB6SmartSearch(KAISHAMEI,SHOUHINMEI);
		return returnVal;
	}
}