package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.honnzonngosyoriselectBUHINSYOUSAI2Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriselectBUHINSYOUSAI2Dao
 * @version

 */

@Repository
public class honnzonngosyoriselectBUHINSYOUSAI2Dao {
	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAI2Mapper honnzonngosyoriselectBUHINSYOUSAI2Mapper;

   
	public List<Double> honnzonngosyoriselectBUHINSYOUSAI2 (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1) throws Exception {

		List<Double> returnVal = honnzonngosyoriselectBUHINSYOUSAI2Mapper.honnzonngosyoriselectBUHINSYOUSAI2(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}