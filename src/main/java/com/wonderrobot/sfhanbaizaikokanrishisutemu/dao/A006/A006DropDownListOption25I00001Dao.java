package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006DropDownListOption25I00001Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006DropDownListOption25I00001Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A006DropDownListOption25I00001Dao
 * @version

 */

@Repository
public class A006DropDownListOption25I00001Dao {
	@Autowired
	private A006DropDownListOption25I00001Mapper A006DropDownListOption25I00001Mapper;

   
	public List<A006DropDownListOption25I00001Entity> I0000125KAISHAIDKAISHAMEIdrp () throws Exception {

		List<A006DropDownListOption25I00001Entity> returnVal = A006DropDownListOption25I00001Mapper.I0000125KAISHAIDKAISHAMEIdrp();
		return returnVal;
	}
}