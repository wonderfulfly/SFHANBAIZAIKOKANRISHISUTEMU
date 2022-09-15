package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013AV101ClickselectSYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AV101ClickselectSYAINDao
 * @version

 */

@Repository
public class A013AV101ClickselectSYAINDao {
	@Autowired
	private A013AV101ClickselectSYAINMapper A013AV101ClickselectSYAINMapper;

   
	public List<A013AV101ClickselectSYAINEntity> A013AV101ClickselectSYAIN (String ROGUINID) throws Exception {

		List<A013AV101ClickselectSYAINEntity> returnVal = A013AV101ClickselectSYAINMapper.A013AV101ClickselectSYAIN(ROGUINID);
		return returnVal;
	}
}