package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickupdateZAIKOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickupdateZAIKOUDao
 * @version

 */

@Repository
public class A007grdB8AE81ClickupdateZAIKOUDao {
	@Autowired
	private A007grdB8AE81ClickupdateZAIKOUMapper A007grdB8AE81ClickupdateZAIKOUMapper;

   
	public int A007grdB8AE81ClickupdateZAIKOU (String ZAIKONO1) throws Exception {

		int returnVal = A007grdB8AE81ClickupdateZAIKOUMapper.A007grdB8AE81ClickupdateZAIKOU(ZAIKONO1);
		return returnVal;
	}
}