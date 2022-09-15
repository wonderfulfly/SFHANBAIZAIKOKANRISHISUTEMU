package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriselectBUHINSYOUSAI1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriselectBUHINSYOUSAI1Dao
 * @version

 */

@Repository
public class honnzonngosyoriselectBUHINSYOUSAI1Dao {
	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAI1Mapper honnzonngosyoriselectBUHINSYOUSAI1Mapper;

   
	public List<Double> honnzonngosyoriselectBUHINSYOUSAI1 (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1) throws Exception {

		List<Double> returnVal = honnzonngosyoriselectBUHINSYOUSAI1Mapper.honnzonngosyoriselectBUHINSYOUSAI1(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}