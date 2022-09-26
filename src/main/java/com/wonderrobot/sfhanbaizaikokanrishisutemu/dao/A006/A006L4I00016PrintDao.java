package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006L4I00016PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006L4I00016PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A006L4I00016PrintDao
 * @version

 */

@Repository
public class A006L4I00016PrintDao {
	@Autowired
	private A006L4I00016PrintMapper A006L4I00016PrintMapper;

   
	public List<A006L4I00016PrintEntity> A006L4I00016Print (String KAISHAMEI, String SHOUHINMEI) throws Exception {

		List<A006L4I00016PrintEntity> returnVal = A006L4I00016PrintMapper.A006L4I00016Print(KAISHAMEI,SHOUHINMEI);
		return returnVal;
	}
}