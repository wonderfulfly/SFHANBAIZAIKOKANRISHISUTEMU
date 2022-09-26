package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W2I00015PrintEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010W2I00015PrintMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A010W2I00015PrintDao
 * @version

 */

@Repository
public class A010W2I00015PrintDao {
	@Autowired
	private A010W2I00015PrintMapper A010W2I00015PrintMapper;

   
	public List<A010W2I00015PrintEntity> A010W2I00015Print (String CHUUMONNO, String TANTOUSHAID, String KYAKUSAKIID, String SHUKKOJOUTAI) throws Exception {

		List<A010W2I00015PrintEntity> returnVal = A010W2I00015PrintMapper.A010W2I00015Print(CHUUMONNO,TANTOUSHAID,KYAKUSAKIID,SHUKKOJOUTAI);
		return returnVal;
	}
}