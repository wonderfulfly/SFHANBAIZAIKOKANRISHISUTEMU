package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T101ClickselectBUHINSYOUSAI1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickselectBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickselectBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class A013T101ClickselectBUHINSYOUSAI1Dao {
	@Autowired
	private A013T101ClickselectBUHINSYOUSAI1Mapper A013T101ClickselectBUHINSYOUSAI1Mapper;

   
	public List<A013T101ClickselectBUHINSYOUSAI1Entity> A013T101ClickselectBUHINSYOUSAI1 (String KOUJIKANRIBANGOU1, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		List<A013T101ClickselectBUHINSYOUSAI1Entity> returnVal = A013T101ClickselectBUHINSYOUSAI1Mapper.A013T101ClickselectBUHINSYOUSAI1(KOUJIKANRIBANGOU1,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}