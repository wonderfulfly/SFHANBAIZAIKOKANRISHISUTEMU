package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYO1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectTYUMONSYO1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectTYUMONSYO1Dao
 * @version

 */

@Repository
public class A011PageAfterSave1selectTYUMONSYO1Dao {
	@Autowired
	private A011PageAfterSave1selectTYUMONSYO1Mapper A011PageAfterSave1selectTYUMONSYO1Mapper;

   
	public List<A011PageAfterSave1selectTYUMONSYO1Entity> A011PageAfterSave1selectTYUMONSYO1 (String CHUUBUNSHONO1) throws Exception {

		List<A011PageAfterSave1selectTYUMONSYO1Entity> returnVal = A011PageAfterSave1selectTYUMONSYO1Mapper.A011PageAfterSave1selectTYUMONSYO1(CHUUBUNSHONO1);
		return returnVal;
	}
}