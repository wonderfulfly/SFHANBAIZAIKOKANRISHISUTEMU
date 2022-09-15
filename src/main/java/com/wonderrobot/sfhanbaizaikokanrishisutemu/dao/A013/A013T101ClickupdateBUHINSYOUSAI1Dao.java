package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickupdateBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickupdateBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class A013T101ClickupdateBUHINSYOUSAI1Dao {
	@Autowired
	private A013T101ClickupdateBUHINSYOUSAI1Mapper A013T101ClickupdateBUHINSYOUSAI1Mapper;

   
	public int A013T101ClickupdateBUHINSYOUSAI1 (String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1) throws Exception {

		int returnVal = A013T101ClickupdateBUHINSYOUSAI1Mapper.A013T101ClickupdateBUHINSYOUSAI1(CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1);
		return returnVal;
	}
}