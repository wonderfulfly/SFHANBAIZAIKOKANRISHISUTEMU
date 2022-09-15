package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010.A010grdC10AD101ClickdeleteMITUMORIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickdeleteMITUMORIDao
 * @version

 */

@Repository
public class A010grdC10AD101ClickdeleteMITUMORIDao {
	@Autowired
	private A010grdC10AD101ClickdeleteMITUMORIMapper A010grdC10AD101ClickdeleteMITUMORIMapper;

   
	public int A010grdC10AD101ClickdeleteMITUMORI (String MITSUMORISHONO) throws Exception {

		int returnVal = A010grdC10AD101ClickdeleteMITUMORIMapper.A010grdC10AD101ClickdeleteMITUMORI(MITSUMORISHONO);
		return returnVal;
	}
}