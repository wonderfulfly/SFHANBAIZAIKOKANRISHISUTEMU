package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011S4I00010PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011S4I00010PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A011S4I00010PrintDao
 * @version

 */

@Repository
public class A011S4I00010PrintDao {
	@Autowired
	private A011S4I00010PrintMapper A011S4I00010PrintMapper;

   
	public List<A011S4I00010PrintEntity> A011S4I00010Print (String CHUUBUNSHONO1) throws Exception {

		List<A011S4I00010PrintEntity> returnVal = A011S4I00010PrintMapper.A011S4I00010Print(CHUUBUNSHONO1);
		return returnVal;
	}
}