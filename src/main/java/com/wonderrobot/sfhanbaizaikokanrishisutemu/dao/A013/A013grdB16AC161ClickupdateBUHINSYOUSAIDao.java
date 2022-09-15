package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickupdateBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickupdateBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013grdB16AC161ClickupdateBUHINSYOUSAIDao {
	@Autowired
	private A013grdB16AC161ClickupdateBUHINSYOUSAIMapper A013grdB16AC161ClickupdateBUHINSYOUSAIMapper;

   
	public int A013grdB16AC161ClickupdateBUHINSYOUSAI (String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1, String KOUJIKANRIBANGOU1, String HINBANNO) throws Exception {

		int returnVal = A013grdB16AC161ClickupdateBUHINSYOUSAIMapper.A013grdB16AC161ClickupdateBUHINSYOUSAI(CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1,KOUJIKANRIBANGOU1,HINBANNO);
		return returnVal;
	}
}