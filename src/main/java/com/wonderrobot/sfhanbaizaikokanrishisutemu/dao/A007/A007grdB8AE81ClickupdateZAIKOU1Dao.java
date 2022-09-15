package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007.A007grdB8AE81ClickupdateZAIKOU1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickupdateZAIKOU1Dao
 * @version

 */

@Repository
public class A007grdB8AE81ClickupdateZAIKOU1Dao {
	@Autowired
	private A007grdB8AE81ClickupdateZAIKOU1Mapper A007grdB8AE81ClickupdateZAIKOU1Mapper;

   
	public int A007grdB8AE81ClickupdateZAIKOU1 (String ZAIKONO1) throws Exception {

		int returnVal = A007grdB8AE81ClickupdateZAIKOU1Mapper.A007grdB8AE81ClickupdateZAIKOU1(ZAIKONO1);
		return returnVal;
	}
}