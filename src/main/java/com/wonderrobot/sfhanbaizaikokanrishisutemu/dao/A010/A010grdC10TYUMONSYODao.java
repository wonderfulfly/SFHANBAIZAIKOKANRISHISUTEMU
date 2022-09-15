package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010grdC10TYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10TYUMONSYOMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10TYUMONSYODao
 * @version

 */

@Repository
public class A010grdC10TYUMONSYODao {
	@Autowired
	private A010grdC10TYUMONSYOMapper A010grdC10TYUMONSYOMapper;

   
	public List<A010grdC10TYUMONSYOEntity> A010InitGrid () throws Exception {

		List<A010grdC10TYUMONSYOEntity> returnVal = A010grdC10TYUMONSYOMapper.A010InitGrid();
		return returnVal;
	}
}