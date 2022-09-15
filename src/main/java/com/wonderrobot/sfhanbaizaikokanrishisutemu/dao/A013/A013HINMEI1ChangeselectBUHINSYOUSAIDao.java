package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013HINMEI1ChangeselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013HINMEI1ChangeselectBUHINSYOUSAIMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013HINMEI1ChangeselectBUHINSYOUSAIDao
 * @version

 */

@Repository
public class A013HINMEI1ChangeselectBUHINSYOUSAIDao {
	@Autowired
	private A013HINMEI1ChangeselectBUHINSYOUSAIMapper A013HINMEI1ChangeselectBUHINSYOUSAIMapper;

   
	public List<A013HINMEI1ChangeselectBUHINSYOUSAIEntity> A013HINMEI1ChangeselectBUHINSYOUSAI (String HINMEI) throws Exception {

		List<A013HINMEI1ChangeselectBUHINSYOUSAIEntity> returnVal = A013HINMEI1ChangeselectBUHINSYOUSAIMapper.A013HINMEI1ChangeselectBUHINSYOUSAI(HINMEI);
		return returnVal;
	}
}