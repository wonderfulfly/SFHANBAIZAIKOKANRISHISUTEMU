package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1updateNYUKINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1updateNYUKINDao
 * @version

 */

@Repository
public class A011PageAfterSave1updateNYUKINDao {
	@Autowired
	private A011PageAfterSave1updateNYUKINMapper A011PageAfterSave1updateNYUKINMapper;

   
	public int A011PageAfterSave1updateNYUKIN (double JPYGOUKEI, String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011PageAfterSave1updateNYUKINMapper.A011PageAfterSave1updateNYUKIN(JPYGOUKEI,CHUUBUNSHONO1);
		return returnVal;
	}
}