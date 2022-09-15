package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006KAISHAMEII00001Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006KAISHAMEII00001Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006KAISHAMEII00001Dao
 * @version

 */

@Repository
public class A006KAISHAMEII00001Dao {
	@Autowired
	private A006KAISHAMEII00001Mapper A006KAISHAMEII00001Mapper;

   
	public List<A006KAISHAMEII00001Entity> A006KAISHAMEIdrp () throws Exception {

		List<A006KAISHAMEII00001Entity> returnVal = A006KAISHAMEII00001Mapper.A006KAISHAMEIdrp();
		return returnVal;
	}
}