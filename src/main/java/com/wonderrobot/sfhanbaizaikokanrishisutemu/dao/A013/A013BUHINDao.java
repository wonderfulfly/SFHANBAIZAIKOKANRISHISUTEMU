package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013BUHINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013BUHINDao
 * @version

 */

@Repository
public class A013BUHINDao {
	@Autowired
	private A013BUHINMapper A013BUHINMapper;

   
	public List<A013BUHINEntity> A013InitDepthZero (String BUHINCHUUBUNSHONO, String KOUJIKANRIBANGOU1, String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		List<A013BUHINEntity> returnVal = A013BUHINMapper.A013InitDepthZero(BUHINCHUUBUNSHONO,KOUJIKANRIBANGOU1,BUHINCHUUBUNSHOMEISAINO);
		return returnVal;
	}
}