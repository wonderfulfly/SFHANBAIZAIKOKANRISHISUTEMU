package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONRepeatCheckEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A003.A003BUMONRepeatCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003BUMONRepeatCheckDao
 * @version

 */

@Repository
public class A003BUMONRepeatCheckDao {
	@Autowired
	private A003BUMONRepeatCheckMapper A003BUMONRepeatCheckMapper;

   
	public List<A003BUMONRepeatCheckEntity> A003BUMONRepeatCheckselectBUMON (String BUMONID1) throws Exception {

		List<A003BUMONRepeatCheckEntity> returnVal = A003BUMONRepeatCheckMapper.A003BUMONRepeatCheckselectBUMON(BUMONID1);
		return returnVal;
	}
}