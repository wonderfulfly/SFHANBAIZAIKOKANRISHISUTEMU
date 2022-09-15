package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002DropDownListOption27BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002DropDownListOption27BUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A002DropDownListOption27BUMONDao
 * @version

 */

@Repository
public class A002DropDownListOption27BUMONDao {
	@Autowired
	private A002DropDownListOption27BUMONMapper A002DropDownListOption27BUMONMapper;

   
	public List<A002DropDownListOption27BUMONEntity> BUMON27BUMONIDBUMONMEIdrp () throws Exception {

		List<A002DropDownListOption27BUMONEntity> returnVal = A002DropDownListOption27BUMONMapper.BUMON27BUMONIDBUMONMEIdrp();
		return returnVal;
	}
}