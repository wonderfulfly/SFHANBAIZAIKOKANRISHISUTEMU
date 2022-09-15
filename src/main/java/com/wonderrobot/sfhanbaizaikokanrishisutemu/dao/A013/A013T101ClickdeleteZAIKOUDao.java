package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickdeleteZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickdeleteZAIKOUDao
 * @version

 */

@Repository
public class A013T101ClickdeleteZAIKOUDao {
	@Autowired
	private A013T101ClickdeleteZAIKOUMapper A013T101ClickdeleteZAIKOUMapper;

   
	public int A013T101ClickdeleteZAIKOU (String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO1) throws Exception {

		int returnVal = A013T101ClickdeleteZAIKOUMapper.A013T101ClickdeleteZAIKOU(CHUUBUNSHONO1,CHUUBUNSHOMEISAINO1);
		return returnVal;
	}
}