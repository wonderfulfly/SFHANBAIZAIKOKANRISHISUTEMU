package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterSave1selectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A009.A009PageAfterSave1selectNYUKINMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterSave1selectNYUKINDao
 * @version

 */

@Repository
public class A009PageAfterSave1selectNYUKINDao {
	@Autowired
	private A009PageAfterSave1selectNYUKINMapper A009PageAfterSave1selectNYUKINMapper;

   
	public List<A009PageAfterSave1selectNYUKINEntity> A009PageAfterSave1selectNYUKIN (String CHUUBUNSHONO1) throws Exception {

		List<A009PageAfterSave1selectNYUKINEntity> returnVal = A009PageAfterSave1selectNYUKINMapper.A009PageAfterSave1selectNYUKIN(CHUUBUNSHONO1);
		return returnVal;
	}
}