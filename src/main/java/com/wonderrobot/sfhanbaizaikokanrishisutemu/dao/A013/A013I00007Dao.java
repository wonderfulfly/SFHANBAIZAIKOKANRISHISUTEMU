package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013I00007Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013I00007Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013I00007Dao
 * @version

 */

@Repository
public class A013I00007Dao {
	@Autowired
	private A013I00007Mapper A013I00007Mapper;

   
	public List<A013I00007Entity> A013AA71selectI00007FuncPrint (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		List<A013I00007Entity> returnVal = A013I00007Mapper.A013AA71selectI00007FuncPrint(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}