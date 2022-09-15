package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001BUMONBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A001.A001BUMONBUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001BUMONBUMONDao
 * @version

 */

@Repository
public class A001BUMONBUMONDao {
	@Autowired
	private A001BUMONBUMONMapper A001BUMONBUMONMapper;

   
	public List<A001BUMONBUMONEntity> A001BUMONdrp () throws Exception {

		List<A001BUMONBUMONEntity> returnVal = A001BUMONBUMONMapper.A001BUMONdrp();
		return returnVal;
	}
}