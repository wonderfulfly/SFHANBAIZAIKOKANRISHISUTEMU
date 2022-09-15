package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011TYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011TYUMONSYODao
 * @version

 */

@Repository
public class A011TYUMONSYODao {
	@Autowired
	private A011TYUMONSYOMapper A011TYUMONSYOMapper;

   
	public List<A011TYUMONSYOEntity> A011InitDepthZero (String CHUUBUNSHONO1) throws Exception {

		List<A011TYUMONSYOEntity> returnVal = A011TYUMONSYOMapper.A011InitDepthZero(CHUUBUNSHONO1);
		return returnVal;
	}
}