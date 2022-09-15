package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015O4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A015.A015O4grdB6SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A015O4grdB6SmartSearchDao
 * @version

 */

@Repository
public class A015O4grdB6SmartSearchDao {
	@Autowired
	private A015O4grdB6SmartSearchMapper A015O4grdB6SmartSearchMapper;

   
	public List<A015O4grdB6SmartSearchEntity> A015O4grdB6SmartSearch (String KAISHAID, String KAISHAMEI) throws Exception {

		List<A015O4grdB6SmartSearchEntity> returnVal = A015O4grdB6SmartSearchMapper.A015O4grdB6SmartSearch(KAISHAID,KAISHAMEI);
		return returnVal;
	}
}