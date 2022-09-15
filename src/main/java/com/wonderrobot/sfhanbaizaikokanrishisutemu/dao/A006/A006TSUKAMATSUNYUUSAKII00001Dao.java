package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006TSUKAMATSUNYUUSAKII00001Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006.A006TSUKAMATSUNYUUSAKII00001Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006TSUKAMATSUNYUUSAKII00001Dao
 * @version

 */

@Repository
public class A006TSUKAMATSUNYUUSAKII00001Dao {
	@Autowired
	private A006TSUKAMATSUNYUUSAKII00001Mapper A006TSUKAMATSUNYUUSAKII00001Mapper;

   
	public List<A006TSUKAMATSUNYUUSAKII00001Entity> A006TSUKAMATSUNYUUSAKIdrp () throws Exception {

		List<A006TSUKAMATSUNYUUSAKII00001Entity> returnVal = A006TSUKAMATSUNYUUSAKII00001Mapper.A006TSUKAMATSUNYUUSAKIdrp();
		return returnVal;
	}
}