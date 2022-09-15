package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectSYOUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickselectSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickselectSYOUHINDao
 * @version

 */

@Repository
public class A011W41ClickselectSYOUHINDao {
	@Autowired
	private A011W41ClickselectSYOUHINMapper A011W41ClickselectSYOUHINMapper;

   
	public List<A011W41ClickselectSYOUHINEntity> A011W41ClickselectSYOUHIN (String ay1_ZAIKOU_SHOUHINNO) throws Exception {

		List<A011W41ClickselectSYOUHINEntity> returnVal = A011W41ClickselectSYOUHINMapper.A011W41ClickselectSYOUHIN(ay1_ZAIKOU_SHOUHINNO);
		return returnVal;
	}
}