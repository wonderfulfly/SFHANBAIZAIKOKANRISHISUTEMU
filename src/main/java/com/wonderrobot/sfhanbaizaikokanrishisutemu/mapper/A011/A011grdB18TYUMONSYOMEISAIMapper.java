package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18TYUMONSYOMEISAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A011grdB18TYUMONSYOMEISAIMapper
 * @version

 */

public interface A011grdB18TYUMONSYOMEISAIMapper {
	public List<A011grdB18TYUMONSYOMEISAIEntity> A011InitGrid(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}