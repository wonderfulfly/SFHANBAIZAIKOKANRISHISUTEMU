package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013HINMEI1ChangeselectBUHINSYOUSAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013HINMEI1ChangeselectBUHINSYOUSAIMapper
 * @version

 */

public interface A013HINMEI1ChangeselectBUHINSYOUSAIMapper {
	public List<A013HINMEI1ChangeselectBUHINSYOUSAIEntity> A013HINMEI1ChangeselectBUHINSYOUSAI(@Param("HINMEI")String HINMEI);
}