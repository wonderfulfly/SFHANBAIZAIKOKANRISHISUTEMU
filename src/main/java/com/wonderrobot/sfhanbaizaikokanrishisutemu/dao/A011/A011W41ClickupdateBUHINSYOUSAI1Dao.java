package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class A011W41ClickupdateBUHINSYOUSAI1Dao {
	@Autowired
	private A011W41ClickupdateBUHINSYOUSAI1Mapper A011W41ClickupdateBUHINSYOUSAI1Mapper;

   
	public int A011W41ClickupdateBUHINSYOUSAI1 (String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011W41ClickupdateBUHINSYOUSAI1Mapper.A011W41ClickupdateBUHINSYOUSAI1(CHUUBUNSHONO1);
		return returnVal;
	}
}