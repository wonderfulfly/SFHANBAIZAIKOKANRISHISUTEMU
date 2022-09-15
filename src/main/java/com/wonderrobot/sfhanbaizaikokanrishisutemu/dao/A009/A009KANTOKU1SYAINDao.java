package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009KANTOKU1SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009KANTOKU1SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009KANTOKU1SYAINDao
 * @version

 */

@Repository
public class A009KANTOKU1SYAINDao {
	@Autowired
	private A009KANTOKU1SYAINMapper A009KANTOKU1SYAINMapper;

   
	public List<A009KANTOKU1SYAINEntity> A009KANTOKU1drp () throws Exception {

		List<A009KANTOKU1SYAINEntity> returnVal = A009KANTOKU1SYAINMapper.A009KANTOKU1drp();
		return returnVal;
	}
}