package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014O4grdC6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A014.A014O4grdC6SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A014O4grdC6SmartSearchDao
 * @version

 */

@Repository
public class A014O4grdC6SmartSearchDao {
	@Autowired
	private A014O4grdC6SmartSearchMapper A014O4grdC6SmartSearchMapper;

   
	public List<A014O4grdC6SmartSearchEntity> A014O4grdC6SmartSearch (String BUMONID, String BUMONMEI) throws Exception {

		List<A014O4grdC6SmartSearchEntity> returnVal = A014O4grdC6SmartSearchMapper.A014O4grdC6SmartSearch(BUMONID,BUMONMEI);
		return returnVal;
	}
}