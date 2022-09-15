package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterdeleteBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterdeleteBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013T7afterdeleteBUHINSYOUSAIDao {
	@Autowired
	private A013T7afterdeleteBUHINSYOUSAIMapper A013T7afterdeleteBUHINSYOUSAIMapper;

   
	public int A013T7afterdeleteBUHINSYOUSAI (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = A013T7afterdeleteBUHINSYOUSAIMapper.A013T7afterdeleteBUHINSYOUSAI(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}