package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterdeleteBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterdeleteBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class A013T7afterdeleteBUHINSYOUSAI1Dao {
	@Autowired
	private A013T7afterdeleteBUHINSYOUSAI1Mapper A013T7afterdeleteBUHINSYOUSAI1Mapper;

   
	public int A013T7afterdeleteBUHINSYOUSAI1 (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KUUHAKUNODEETAWOSAKUJOSURU) throws Exception {

		int returnVal = A013T7afterdeleteBUHINSYOUSAI1Mapper.A013T7afterdeleteBUHINSYOUSAI1(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KUUHAKUNODEETAWOSAKUJOSURU);
		return returnVal;
	}
}