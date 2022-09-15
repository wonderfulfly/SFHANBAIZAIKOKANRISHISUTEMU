package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18W181ClickselectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011.A011grdB18W181ClickselectBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011grdB18W181ClickselectBUHINDao
 * @version

 */

@Repository
public class A011grdB18W181ClickselectBUHINDao {
	@Autowired
	private A011grdB18W181ClickselectBUHINMapper A011grdB18W181ClickselectBUHINMapper;

   
	public List<A011grdB18W181ClickselectBUHINEntity> A011grdB18W181ClickselectBUHIN (String CHUUBUNSHONO1, String CHUUBUNSHOMEISAINO) throws Exception {

		List<A011grdB18W181ClickselectBUHINEntity> returnVal = A011grdB18W181ClickselectBUHINMapper.A011grdB18W181ClickselectBUHIN(CHUUBUNSHONO1,CHUUBUNSHOMEISAINO);
		return returnVal;
	}
}