package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectTYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6afterselectTYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterselectTYUMONSYODao
 * @version

 */

@Repository
public class A010W6afterselectTYUMONSYODao {
	@Autowired
	private A010W6afterselectTYUMONSYOMapper A010W6afterselectTYUMONSYOMapper;

   
	public List<A010W6afterselectTYUMONSYOEntity> A010W6afterselectTYUMONSYO (String MITUMORIRINJIHYOU_MITSUMORINO) throws Exception {

		List<A010W6afterselectTYUMONSYOEntity> returnVal = A010W6afterselectTYUMONSYOMapper.A010W6afterselectTYUMONSYO(MITUMORIRINJIHYOU_MITSUMORINO);
		return returnVal;
	}
}