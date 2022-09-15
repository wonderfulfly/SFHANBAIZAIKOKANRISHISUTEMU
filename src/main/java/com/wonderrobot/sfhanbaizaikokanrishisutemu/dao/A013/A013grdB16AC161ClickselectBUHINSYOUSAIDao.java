package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickselectBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickselectBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013grdB16AC161ClickselectBUHINSYOUSAIDao {
	@Autowired
	private A013grdB16AC161ClickselectBUHINSYOUSAIMapper A013grdB16AC161ClickselectBUHINSYOUSAIMapper;

   
	public List<A013grdB16AC161ClickselectBUHINSYOUSAIEntity> A013grdB16AC161ClickselectBUHINSYOUSAI (String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1, String KOUJIKANRIBANGOU1, String HINBANNO) throws Exception {

		List<A013grdB16AC161ClickselectBUHINSYOUSAIEntity> returnVal = A013grdB16AC161ClickselectBUHINSYOUSAIMapper.A013grdB16AC161ClickselectBUHINSYOUSAI(CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1,KOUJIKANRIBANGOU1,HINBANNO);
		return returnVal;
	}
}