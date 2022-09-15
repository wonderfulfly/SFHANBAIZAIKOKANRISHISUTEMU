package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickdeleteZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickdeleteZAIKOUDao
 * @version

 */

@Repository
public class A011W41ClickdeleteZAIKOUDao {
	@Autowired
	private A011W41ClickdeleteZAIKOUMapper A011W41ClickdeleteZAIKOUMapper;

   
	public int A011W41ClickdeleteZAIKOU (String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011W41ClickdeleteZAIKOUMapper.A011W41ClickdeleteZAIKOU(CHUUBUNSHONO1);
		return returnVal;
	}
}