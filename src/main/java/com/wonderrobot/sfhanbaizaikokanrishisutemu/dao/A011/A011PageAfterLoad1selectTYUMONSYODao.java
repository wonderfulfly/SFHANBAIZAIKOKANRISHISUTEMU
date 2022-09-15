package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectTYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterLoad1selectTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1selectTYUMONSYODao
 * @version

 */

@Repository
public class A011PageAfterLoad1selectTYUMONSYODao {
	@Autowired
	private A011PageAfterLoad1selectTYUMONSYOMapper A011PageAfterLoad1selectTYUMONSYOMapper;

   
	public List<A011PageAfterLoad1selectTYUMONSYOEntity> A011PageAfterLoad1selectTYUMONSYO (String CHUUBUNSHONO1) throws Exception {

		List<A011PageAfterLoad1selectTYUMONSYOEntity> returnVal = A011PageAfterLoad1selectTYUMONSYOMapper.A011PageAfterLoad1selectTYUMONSYO(CHUUBUNSHONO1);
		return returnVal;
	}
}