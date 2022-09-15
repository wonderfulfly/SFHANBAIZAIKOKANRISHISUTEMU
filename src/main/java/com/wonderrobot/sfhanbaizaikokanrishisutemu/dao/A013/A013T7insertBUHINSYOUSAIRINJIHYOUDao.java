package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7insertBUHINSYOUSAIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A013T7insertBUHINSYOUSAIRINJIHYOUDao
 * @version

 */

@Repository
public class A013T7insertBUHINSYOUSAIRINJIHYOUDao {
	@Autowired
	private A013T7insertBUHINSYOUSAIRINJIHYOUMapper A013T7insertBUHINSYOUSAIRINJIHYOUMapper;

   
	public int A013T7insertBUHINSYOUSAIRINJIHYOU (String KYAKUSAKIMEISHOU, String ASENBURIRAIN, String KIKAIMEISHOU, String BUHINMEISHOU, String HINBANNO1, int SEISAKUSUU, String SHANAIKOUJIBANGOU, String TANTOUSHA, String MAISUU, String HIDZUKE, String HINMEI, int KOSUU, int SOUKOSUU, String ZAISHITSU_KEISHIKI, String SEISAKUSHA, String TOUROKUSHAID, String SEISAKUHINKUBUN, String DOUNYUUBANGOU, String KIBOUNOUKI, String HINBANNO) throws Exception {

		int returnVal = A013T7insertBUHINSYOUSAIRINJIHYOUMapper.A013T7insertBUHINSYOUSAIRINJIHYOU(KYAKUSAKIMEISHOU,ASENBURIRAIN,KIKAIMEISHOU,BUHINMEISHOU,HINBANNO1,SEISAKUSUU,SHANAIKOUJIBANGOU,TANTOUSHA,MAISUU,HIDZUKE,HINMEI,KOSUU,SOUKOSUU,ZAISHITSU_KEISHIKI,SEISAKUSHA,TOUROKUSHAID,SEISAKUHINKUBUN,DOUNYUUBANGOU,KIBOUNOUKI,HINBANNO);
		return returnVal;
	}
}