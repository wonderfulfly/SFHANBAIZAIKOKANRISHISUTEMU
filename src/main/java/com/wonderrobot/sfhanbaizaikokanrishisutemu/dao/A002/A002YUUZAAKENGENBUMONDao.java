package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002YUUZAAKENGENBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002.A002YUUZAAKENGENBUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002YUUZAAKENGENBUMONDao
 * @version

 */

@Repository
public class A002YUUZAAKENGENBUMONDao {
	@Autowired
	private A002YUUZAAKENGENBUMONMapper A002YUUZAAKENGENBUMONMapper;

   
	public List<A002YUUZAAKENGENBUMONEntity> A002YUUZAAKENGENdrp () throws Exception {

		List<A002YUUZAAKENGENBUMONEntity> returnVal = A002YUUZAAKENGENBUMONMapper.A002YUUZAAKENGENdrp();
		return returnVal;
	}
}