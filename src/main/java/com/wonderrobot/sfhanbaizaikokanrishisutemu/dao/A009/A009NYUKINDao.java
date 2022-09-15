package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009NYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009NYUKINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009NYUKINDao
 * @version

 */

@Repository
public class A009NYUKINDao {
	@Autowired
	private A009NYUKINMapper A009NYUKINMapper;

   
	public List<A009NYUKINEntity> A009InitDepthZero (String RYOUSHUUSHONO) throws Exception {

		List<A009NYUKINEntity> returnVal = A009NYUKINMapper.A009InitDepthZero(RYOUSHUUSHONO);
		return returnVal;
	}
}