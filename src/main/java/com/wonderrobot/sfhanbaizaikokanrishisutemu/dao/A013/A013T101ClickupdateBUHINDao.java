package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T101ClickupdateBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickupdateBUHINDao
 * @version

 */

@Repository
public class A013T101ClickupdateBUHINDao {
	@Autowired
	private A013T101ClickupdateBUHINMapper A013T101ClickupdateBUHINMapper;

   
	public int A013T101ClickupdateBUHIN (String ay1_BUHINSYOUSAI_CHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		int returnVal = A013T101ClickupdateBUHINMapper.A013T101ClickupdateBUHIN(ay1_BUHINSYOUSAI_CHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}