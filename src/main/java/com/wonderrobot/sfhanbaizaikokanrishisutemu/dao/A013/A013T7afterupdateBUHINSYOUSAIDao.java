package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterupdateBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterupdateBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013T7afterupdateBUHINSYOUSAIDao {
	@Autowired
	private A013T7afterupdateBUHINSYOUSAIMapper A013T7afterupdateBUHINSYOUSAIMapper;

   
	public int A013T7afterupdateBUHINSYOUSAI (double KOUNYUUTANKA_SUM, String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU, String ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO) throws Exception {

		int returnVal = A013T7afterupdateBUHINSYOUSAIMapper.A013T7afterupdateBUHINSYOUSAI(KOUNYUUTANKA_SUM,BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU,ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO);
		return returnVal;
	}
}