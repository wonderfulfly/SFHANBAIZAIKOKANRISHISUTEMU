package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013AV101ClickselectBUMONMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AV101ClickselectBUMONDao
 * @version

 */

@Repository
public class A013AV101ClickselectBUMONDao {
	@Autowired
	private A013AV101ClickselectBUMONMapper A013AV101ClickselectBUMONMapper;

   
	public List<A013AV101ClickselectBUMONEntity> A013AV101ClickselectBUMON (String ay1_SYAIN_YUUZAAKENGEN) throws Exception {

		List<A013AV101ClickselectBUMONEntity> returnVal = A013AV101ClickselectBUMONMapper.A013AV101ClickselectBUMON(ay1_SYAIN_YUUZAAKENGEN);
		return returnVal;
	}
}