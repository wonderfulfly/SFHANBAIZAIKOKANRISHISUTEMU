package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriselectBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriselectBUHINSYOUSAIDao
 * @version

 */

@Repository
public class honnzonngosyoriselectBUHINSYOUSAIDao {
	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAIMapper honnzonngosyoriselectBUHINSYOUSAIMapper;

   
	public List<Double> honnzonngosyoriselectBUHINSYOUSAI (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1) throws Exception {

		List<Double> returnVal = honnzonngosyoriselectBUHINSYOUSAIMapper.honnzonngosyoriselectBUHINSYOUSAI(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}