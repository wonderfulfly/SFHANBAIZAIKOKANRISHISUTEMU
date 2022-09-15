package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8AE81ClickselectSYOUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickselectSYOUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickselectSYOUHINDao
 * @version

 */

@Repository
public class A007grdB8AE81ClickselectSYOUHINDao {
	@Autowired
	private A007grdB8AE81ClickselectSYOUHINMapper A007grdB8AE81ClickselectSYOUHINMapper;

   
	public List<A007grdB8AE81ClickselectSYOUHINEntity> A007grdB8AE81ClickselectSYOUHIN (String SHOUHINNO) throws Exception {

		List<A007grdB8AE81ClickselectSYOUHINEntity> returnVal = A007grdB8AE81ClickselectSYOUHINMapper.A007grdB8AE81ClickselectSYOUHIN(SHOUHINNO);
		return returnVal;
	}
}