package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013TANTOUSHA1SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013TANTOUSHA1SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013TANTOUSHA1SYAINDao
 * @version

 */

@Repository
public class A013TANTOUSHA1SYAINDao {
	@Autowired
	private A013TANTOUSHA1SYAINMapper A013TANTOUSHA1SYAINMapper;

   
	public List<A013TANTOUSHA1SYAINEntity> A013TANTOUSHA1drp () throws Exception {

		List<A013TANTOUSHA1SYAINEntity> returnVal = A013TANTOUSHA1SYAINMapper.A013TANTOUSHA1drp();
		return returnVal;
	}
}