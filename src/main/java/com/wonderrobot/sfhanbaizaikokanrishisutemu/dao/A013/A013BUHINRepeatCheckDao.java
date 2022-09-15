package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINRepeatCheckEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013BUHINRepeatCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013BUHINRepeatCheckDao
 * @version

 */

@Repository
public class A013BUHINRepeatCheckDao {
	@Autowired
	private A013BUHINRepeatCheckMapper A013BUHINRepeatCheckMapper;

   
	public List<A013BUHINRepeatCheckEntity> A013BUHINRepeatCheckselectBUHIN (String KOUJIKANRIBANGOU1, String BUHINCHUUBUNSHOMEISAINO, String BUHINCHUUBUNSHONO) throws Exception {

		List<A013BUHINRepeatCheckEntity> returnVal = A013BUHINRepeatCheckMapper.A013BUHINRepeatCheckselectBUHIN(KOUJIKANRIBANGOU1,BUHINCHUUBUNSHOMEISAINO,BUHINCHUUBUNSHONO);
		return returnVal;
	}
}