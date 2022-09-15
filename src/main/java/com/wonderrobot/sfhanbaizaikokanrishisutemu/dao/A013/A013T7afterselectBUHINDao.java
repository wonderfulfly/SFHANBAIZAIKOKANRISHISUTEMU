package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013T7afterselectBUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterselectBUHINDao
 * @version

 */

@Repository
public class A013T7afterselectBUHINDao {
	@Autowired
	private A013T7afterselectBUHINMapper A013T7afterselectBUHINMapper;

   
	public List<A013T7afterselectBUHINEntity> A013T7afterselectBUHIN (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		List<A013T7afterselectBUHINEntity> returnVal = A013T7afterselectBUHINMapper.A013T7afterselectBUHIN(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}