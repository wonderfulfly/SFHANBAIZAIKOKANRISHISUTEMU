package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DropDownListOption31SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A008.A008DropDownListOption31SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A008DropDownListOption31SYAINDao
 * @version

 */

@Repository
public class A008DropDownListOption31SYAINDao {
	@Autowired
	private A008DropDownListOption31SYAINMapper A008DropDownListOption31SYAINMapper;

   
	public List<A008DropDownListOption31SYAINEntity> SYAIN31SHAINIDSHAINMEIdrp () throws Exception {

		List<A008DropDownListOption31SYAINEntity> returnVal = A008DropDownListOption31SYAINMapper.SYAIN31SHAINIDSHAINMEIdrp();
		return returnVal;
	}
}