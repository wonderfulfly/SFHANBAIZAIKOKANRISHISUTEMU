package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectTYUMONSYOEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A010W6afterselectTYUMONSYOMapper
 * @version

 */

public interface A010W6afterselectTYUMONSYOMapper {
	public List<A010W6afterselectTYUMONSYOEntity> A010W6afterselectTYUMONSYO(@Param("MITUMORIRINJIHYOU_MITSUMORINO")String MITUMORIRINJIHYOU_MITSUMORINO);
}