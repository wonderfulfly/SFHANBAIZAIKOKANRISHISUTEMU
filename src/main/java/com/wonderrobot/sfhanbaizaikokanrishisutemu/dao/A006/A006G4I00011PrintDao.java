package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006G4I00011PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006G4I00011PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A006G4I00011PrintDao
 * @version

 */

@Repository
public class A006G4I00011PrintDao {
	@Autowired
	private A006G4I00011PrintMapper A006G4I00011PrintMapper;

   
	public List<A006G4I00011PrintEntity> A006G4I00011Print (String SHOUHINMEI, String KAISHAMEI) throws Exception {

		List<A006G4I00011PrintEntity> returnVal = A006G4I00011PrintMapper.A006G4I00011Print(SHOUHINMEI,KAISHAMEI);
		return returnVal;
	}
}