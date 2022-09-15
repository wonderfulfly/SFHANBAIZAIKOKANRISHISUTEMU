package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16BUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013grdB16BUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16BUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013grdB16BUHINSYOUSAIDao {
	@Autowired
	private A013grdB16BUHINSYOUSAIMapper A013grdB16BUHINSYOUSAIMapper;

   
	public List<A013grdB16BUHINSYOUSAIEntity> A013InitGrid (String BUHINCHUUBUNSHOMEISAINO, String BUHINCHUUBUNSHONO, String KOUJIKANRIBANGOU1) throws Exception {

		List<A013grdB16BUHINSYOUSAIEntity> returnVal = A013grdB16BUHINSYOUSAIMapper.A013InitGrid(BUHINCHUUBUNSHOMEISAINO,BUHINCHUUBUNSHONO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}