package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T101ClickselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickselectBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickselectBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013T101ClickselectBUHINSYOUSAIDao {
	@Autowired
	private A013T101ClickselectBUHINSYOUSAIMapper A013T101ClickselectBUHINSYOUSAIMapper;

   
	public List<A013T101ClickselectBUHINSYOUSAIEntity> A013T101ClickselectBUHINSYOUSAI (String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1) throws Exception {

		List<A013T101ClickselectBUHINSYOUSAIEntity> returnVal = A013T101ClickselectBUHINSYOUSAIMapper.A013T101ClickselectBUHINSYOUSAI(BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}