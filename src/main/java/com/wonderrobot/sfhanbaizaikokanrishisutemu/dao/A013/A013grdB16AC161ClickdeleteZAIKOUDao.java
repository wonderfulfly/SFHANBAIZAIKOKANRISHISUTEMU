package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16AC161ClickdeleteZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickdeleteZAIKOUDao
 * @version

 */

@Repository
public class A013grdB16AC161ClickdeleteZAIKOUDao {
	@Autowired
	private A013grdB16AC161ClickdeleteZAIKOUMapper A013grdB16AC161ClickdeleteZAIKOUMapper;

   
	public int A013grdB16AC161ClickdeleteZAIKOU (String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1, String HINBANNO) throws Exception {

		int returnVal = A013grdB16AC161ClickdeleteZAIKOUMapper.A013grdB16AC161ClickdeleteZAIKOU(CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1,HINBANNO);
		return returnVal;
	}
}