package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TANTOUSHAID1SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010TANTOUSHAID1SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010TANTOUSHAID1SYAINDao
 * @version

 */

@Repository
public class A010TANTOUSHAID1SYAINDao {
	@Autowired
	private A010TANTOUSHAID1SYAINMapper A010TANTOUSHAID1SYAINMapper;

   
	public List<A010TANTOUSHAID1SYAINEntity> A010TANTOUSHAID1drp () throws Exception {

		List<A010TANTOUSHAID1SYAINEntity> returnVal = A010TANTOUSHAID1SYAINMapper.A010TANTOUSHAID1drp();
		return returnVal;
	}
}