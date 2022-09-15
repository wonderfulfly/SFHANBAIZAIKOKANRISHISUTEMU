package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickupdateSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickupdateSYOUHINDao
 * @version

 */

@Repository
public class A007grdB8AE81ClickupdateSYOUHINDao {
	@Autowired
	private A007grdB8AE81ClickupdateSYOUHINMapper A007grdB8AE81ClickupdateSYOUHINMapper;

   
	public int A007grdB8AE81ClickupdateSYOUHIN (int ay3_SYOUHIN_ZAIKOSUURYOU, String SHOUHINNO) throws Exception {

		int returnVal = A007grdB8AE81ClickupdateSYOUHINMapper.A007grdB8AE81ClickupdateSYOUHIN(ay3_SYOUHIN_ZAIKOSUURYOU,SHOUHINNO);
		return returnVal;
	}
}