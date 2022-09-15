package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper
 * @version

 */

public interface A013T7afterselectBUHINSYOUSAIRINJIHYOU1Mapper {
	public List<A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity> A013T7afterselectBUHINSYOUSAIRINJIHYOU1(@Param("NOROGUINIDTOITCHISURU")String NOROGUINIDTOITCHISURU);
}