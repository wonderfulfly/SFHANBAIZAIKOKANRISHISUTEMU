package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011PageAfterSave1selectBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1selectBUHINDao
 * @version

 */

@Repository
public class A011PageAfterSave1selectBUHINDao {
	@Autowired
	private A011PageAfterSave1selectBUHINMapper A011PageAfterSave1selectBUHINMapper;

   
	public List<A011PageAfterSave1selectBUHINEntity> A011PageAfterSave1selectBUHIN (String ay6_TYUMONSYO_CHUUBUNSHONO, String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO) throws Exception {

		List<A011PageAfterSave1selectBUHINEntity> returnVal = A011PageAfterSave1selectBUHINMapper.A011PageAfterSave1selectBUHIN(ay6_TYUMONSYO_CHUUBUNSHONO,ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
		return returnVal;
	}
}