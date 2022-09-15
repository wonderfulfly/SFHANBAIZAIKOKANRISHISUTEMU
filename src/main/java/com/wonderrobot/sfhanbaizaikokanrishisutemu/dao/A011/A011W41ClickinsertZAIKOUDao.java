package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickinsertZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickinsertZAIKOUDao
 * @version

 */

@Repository
public class A011W41ClickinsertZAIKOUDao {
	@Autowired
	private A011W41ClickinsertZAIKOUMapper A011W41ClickinsertZAIKOUMapper;

   
	public int A011W41ClickinsertZAIKOU (String ay1_ZAIKOU_SHOUHINMEISHOU, String KYOU, String ay1_ZAIKOU_CHUUBUNSHOMEISAINO, String ay1_ZAIKOU_KOUJIKANRIBANGOU, String ay1_ZAIKOU_TSUKAMATSUNYUUSAKI, double SHOUKEI, String SHUKKANO1, int ay1_ZAIKOU_SUURYOU, String ZAIKONOautoNum, double ay1_ZAIKOU_PRICE, String ay1_ZAIKOU_HINBANNO) throws Exception {

		int returnVal = A011W41ClickinsertZAIKOUMapper.A011W41ClickinsertZAIKOU(ay1_ZAIKOU_SHOUHINMEISHOU,KYOU,ay1_ZAIKOU_CHUUBUNSHOMEISAINO,ay1_ZAIKOU_KOUJIKANRIBANGOU,ay1_ZAIKOU_TSUKAMATSUNYUUSAKI,SHOUKEI,SHUKKANO1,ay1_ZAIKOU_SUURYOU,ZAIKONOautoNum,ay1_ZAIKOU_PRICE,ay1_ZAIKOU_HINBANNO);
		return returnVal;
	}
}