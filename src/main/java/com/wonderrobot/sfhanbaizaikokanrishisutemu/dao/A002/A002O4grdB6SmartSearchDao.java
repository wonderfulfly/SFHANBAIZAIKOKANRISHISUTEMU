package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002O4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002O4grdB6SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A002O4grdB6SmartSearchDao
 * @version

 */

@Repository
public class A002O4grdB6SmartSearchDao {
	@Autowired
	private A002O4grdB6SmartSearchMapper A002O4grdB6SmartSearchMapper;

   
	public List<A002O4grdB6SmartSearchEntity> A002O4grdB6SmartSearch (String SHAINID, String SHAINMEI) throws Exception {

		List<A002O4grdB6SmartSearchEntity> returnVal = A002O4grdB6SmartSearchMapper.A002O4grdB6SmartSearch(SHAINID,SHAINMEI);
		return returnVal;
	}
}