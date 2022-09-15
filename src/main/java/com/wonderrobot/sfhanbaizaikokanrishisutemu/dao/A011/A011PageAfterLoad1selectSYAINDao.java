package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterLoad1selectSYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1selectSYAINDao
 * @version

 */

@Repository
public class A011PageAfterLoad1selectSYAINDao {
	@Autowired
	private A011PageAfterLoad1selectSYAINMapper A011PageAfterLoad1selectSYAINMapper;

   
	public List<A011PageAfterLoad1selectSYAINEntity> A011PageAfterLoad1selectSYAIN (String ROGUINID) throws Exception {

		List<A011PageAfterLoad1selectSYAINEntity> returnVal = A011PageAfterLoad1selectSYAINMapper.A011PageAfterLoad1selectSYAIN(ROGUINID);
		return returnVal;
	}
}