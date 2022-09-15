package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011W41ClickupdateTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickupdateTYUMONSYODao
 * @version

 */

@Repository
public class A011W41ClickupdateTYUMONSYODao {
	@Autowired
	private A011W41ClickupdateTYUMONSYOMapper A011W41ClickupdateTYUMONSYOMapper;

   
	public int A011W41ClickupdateTYUMONSYO (String CHUUBUNSHONO1) throws Exception {

		int returnVal = A011W41ClickupdateTYUMONSYOMapper.A011W41ClickupdateTYUMONSYO(CHUUBUNSHONO1);
		return returnVal;
	}
}