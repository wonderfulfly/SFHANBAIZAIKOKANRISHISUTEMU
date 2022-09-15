package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010H8grdC10SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010H8grdC10SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A010H8grdC10SmartSearchDao
 * @version

 */

@Repository
public class A010H8grdC10SmartSearchDao {
	@Autowired
	private A010H8grdC10SmartSearchMapper A010H8grdC10SmartSearchMapper;

   
	public List<A010H8grdC10SmartSearchEntity> A010H8grdC10SmartSearch (String _, String CHUUMONBI, String CHUUMONNO, String KOUJIBANGOU, String KYAKUSAKIID, String MITSUMORINO, String TANTOUSHAID, String SHUKKOJOUTAI) throws Exception {

		List<A010H8grdC10SmartSearchEntity> returnVal = A010H8grdC10SmartSearchMapper.A010H8grdC10SmartSearch(_,CHUUMONBI,CHUUMONNO,KOUJIBANGOU,KYAKUSAKIID,MITSUMORINO,TANTOUSHAID,SHUKKOJOUTAI);
		return returnVal;
	}
}