package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateSYOUHINDao
 * @version

 */

@Repository
public class A011W41ClickupdateSYOUHINDao {
	@Autowired
	private A011W41ClickupdateSYOUHINMapper A011W41ClickupdateSYOUHINMapper;

   
	public int A011W41ClickupdateSYOUHIN (int SYOUHIN_ZAIKOSUURYOU, String ay1_ZAIKOU_SHOUHINNO) throws Exception {

		int returnVal = A011W41ClickupdateSYOUHINMapper.A011W41ClickupdateSYOUHIN(SYOUHIN_ZAIKOSUURYOU,ay1_ZAIKOU_SHOUHINNO);
		return returnVal;
	}
}