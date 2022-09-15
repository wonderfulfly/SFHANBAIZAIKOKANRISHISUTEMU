package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DropDownListOption59SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010DropDownListOption59SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A010DropDownListOption59SYAINDao
 * @version

 */

@Repository
public class A010DropDownListOption59SYAINDao {
	@Autowired
	private A010DropDownListOption59SYAINMapper A010DropDownListOption59SYAINMapper;

   
	public List<A010DropDownListOption59SYAINEntity> SYAIN59SHAINIDSHAINMEIdrp () throws Exception {

		List<A010DropDownListOption59SYAINEntity> returnVal = A010DropDownListOption59SYAINMapper.SYAIN59SHAINIDSHAINMEIdrp();
		return returnVal;
	}
}