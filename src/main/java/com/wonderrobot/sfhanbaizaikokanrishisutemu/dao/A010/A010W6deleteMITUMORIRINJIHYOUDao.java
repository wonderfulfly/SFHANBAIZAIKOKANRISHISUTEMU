package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W6deleteMITUMORIRINJIHYOUMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A010W6deleteMITUMORIRINJIHYOUDao
 * @version

 */

@Repository
public class A010W6deleteMITUMORIRINJIHYOUDao {
	@Autowired
	private A010W6deleteMITUMORIRINJIHYOUMapper A010W6deleteMITUMORIRINJIHYOUMapper;

   
	public int A010W6deleteMITUMORIRINJIHYOU () throws Exception {

		int returnVal = A010W6deleteMITUMORIRINJIHYOUMapper.A010W6deleteMITUMORIRINJIHYOU();
		return returnVal;
	}
}