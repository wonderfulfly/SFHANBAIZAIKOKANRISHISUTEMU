package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003BUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003BUMONDao
 * @version

 */

@Repository
public class A003BUMONDao {
	@Autowired
	private A003BUMONMapper A003BUMONMapper;

   
	public List<A003BUMONEntity> A003InitDepthZero (String BUMONID1) throws Exception {

		List<A003BUMONEntity> returnVal = A003BUMONMapper.A003InitDepthZero(BUMONID1);
		return returnVal;
	}
}