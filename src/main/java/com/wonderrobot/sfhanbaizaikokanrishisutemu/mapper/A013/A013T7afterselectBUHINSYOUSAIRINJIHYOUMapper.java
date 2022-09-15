package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper
 * @version

 */

public interface A013T7afterselectBUHINSYOUSAIRINJIHYOUMapper {
	public List<A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity> A013T7afterselectBUHINSYOUSAIRINJIHYOU(@Param("ROGUINID")String ROGUINID);
}