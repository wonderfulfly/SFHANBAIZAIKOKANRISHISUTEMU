package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickselectBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class A013grdB16AC161ClickselectBUHINSYOUSAI1Dao {
	@Autowired
	private A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper;

   
	public List<A013grdB16AC161ClickselectBUHINSYOUSAI1Entity> A013grdB16AC161ClickselectBUHINSYOUSAI1 (String ay4_BUHINSYOUSAI_CHUUBUNSHONO, String CHUUBUNSHOMEISAINO1, String KOUJIKANRIBANGOU1, String HINBANNO) throws Exception {

		List<A013grdB16AC161ClickselectBUHINSYOUSAI1Entity> returnVal = A013grdB16AC161ClickselectBUHINSYOUSAI1Mapper.A013grdB16AC161ClickselectBUHINSYOUSAI1(ay4_BUHINSYOUSAI_CHUUBUNSHONO,CHUUBUNSHOMEISAINO1,KOUJIKANRIBANGOU1,HINBANNO);
		return returnVal;
	}
}