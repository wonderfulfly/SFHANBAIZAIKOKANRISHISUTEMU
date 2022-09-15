package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011O4I00017PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011O4I00017PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A011O4I00017PrintDao
 * @version

 */

@Repository
public class A011O4I00017PrintDao {
	@Autowired
	private A011O4I00017PrintMapper A011O4I00017PrintMapper;

   
	public List<A011O4I00017PrintEntity> A011O4I00017Print (String CHUUBUNSHONO1) throws Exception {

		List<A011O4I00017PrintEntity> returnVal = A011O4I00017PrintMapper.A011O4I00017Print(CHUUBUNSHONO1);
		return returnVal;
	}
}