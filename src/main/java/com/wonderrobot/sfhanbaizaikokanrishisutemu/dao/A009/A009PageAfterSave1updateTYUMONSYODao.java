package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009PageAfterSave1updateTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterSave1updateTYUMONSYODao
 * @version

 */

@Repository
public class A009PageAfterSave1updateTYUMONSYODao {
	@Autowired
	private A009PageAfterSave1updateTYUMONSYOMapper A009PageAfterSave1updateTYUMONSYOMapper;

   
	public int A009PageAfterSave1updateTYUMONSYO (String ay1_NYUKIN_RESHIITONO, String CHUUBUNSHONO1) throws Exception {

		int returnVal = A009PageAfterSave1updateTYUMONSYOMapper.A009PageAfterSave1updateTYUMONSYO(ay1_NYUKIN_RESHIITONO,CHUUBUNSHONO1);
		return returnVal;
	}
}