package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterLoad1selectBUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1selectBUMONDao
 * @version

 */

@Repository
public class A011PageAfterLoad1selectBUMONDao {
	@Autowired
	private A011PageAfterLoad1selectBUMONMapper A011PageAfterLoad1selectBUMONMapper;

   
	public List<A011PageAfterLoad1selectBUMONEntity> A011PageAfterLoad1selectBUMON (String SYAIN_YUUZAAKENGEN) throws Exception {

		List<A011PageAfterLoad1selectBUMONEntity> returnVal = A011PageAfterLoad1selectBUMONMapper.A011PageAfterLoad1selectBUMON(SYAIN_YUUZAAKENGEN);
		return returnVal;
	}
}