package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013DropDownListOption115SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013DropDownListOption115SYAINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A013DropDownListOption115SYAINDao
 * @version

 */

@Repository
public class A013DropDownListOption115SYAINDao {
	@Autowired
	private A013DropDownListOption115SYAINMapper A013DropDownListOption115SYAINMapper;

   
	public List<A013DropDownListOption115SYAINEntity> SYAIN115SHAINIDSHAINMEIdrp () throws Exception {

		List<A013DropDownListOption115SYAINEntity> returnVal = A013DropDownListOption115SYAINMapper.SYAIN115SHAINIDSHAINMEIdrp();
		return returnVal;
	}
}