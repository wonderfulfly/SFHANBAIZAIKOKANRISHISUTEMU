package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008Q2I00012PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008Q2I00012PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A008Q2I00012PrintDao
 * @version

 */

@Repository
public class A008Q2I00012PrintDao {
	@Autowired
	private A008Q2I00012PrintMapper A008Q2I00012PrintMapper;

   
	public List<A008Q2I00012PrintEntity> A008Q2I00012Print (String KYAKUSAKI, String CHUUMONHIDZUKE) throws Exception {

		List<A008Q2I00012PrintEntity> returnVal = A008Q2I00012PrintMapper.A008Q2I00012Print(KYAKUSAKI,CHUUMONHIDZUKE);
		return returnVal;
	}
}