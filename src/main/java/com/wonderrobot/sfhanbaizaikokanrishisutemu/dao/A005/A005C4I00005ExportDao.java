package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A005.A005C4I00005ExportEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005.A005C4I00005ExportMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A005C4I00005ExportDao
 * @version

 */

@Repository
public class A005C4I00005ExportDao {
	@Autowired
	private A005C4I00005ExportMapper A005C4I00005ExportMapper;

   
	public List<A005C4I00005ExportEntity> A005C4I00005Export () throws Exception {

		List<A005C4I00005ExportEntity> returnVal = A005C4I00005ExportMapper.A005C4I00005Export();
		return returnVal;
	}
}