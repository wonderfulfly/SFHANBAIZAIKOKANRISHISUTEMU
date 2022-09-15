package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectTYUMONSYODao
 * @version

 */

@Repository
public class A011PageAfterSave1selectTYUMONSYODao {
	@Autowired
	private A011PageAfterSave1selectTYUMONSYOMapper A011PageAfterSave1selectTYUMONSYOMapper;

   
	public List<A011PageAfterSave1selectTYUMONSYOEntity> A011PageAfterSave1selectTYUMONSYO (String CHUUBUNSHONO1) throws Exception {

		List<A011PageAfterSave1selectTYUMONSYOEntity> returnVal = A011PageAfterSave1selectTYUMONSYOMapper.A011PageAfterSave1selectTYUMONSYO(CHUUBUNSHONO1);
		return returnVal;
	}
}