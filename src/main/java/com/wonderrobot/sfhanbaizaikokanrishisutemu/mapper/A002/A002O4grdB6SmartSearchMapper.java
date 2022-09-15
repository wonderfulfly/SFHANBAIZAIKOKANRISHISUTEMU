package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A002;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002O4grdB6SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A002O4grdB6SmartSearchMapper
 * @version

 */

public interface A002O4grdB6SmartSearchMapper {
	public List<A002O4grdB6SmartSearchEntity> A002O4grdB6SmartSearch(@Param("SHAINID")String SHAINID, @Param("SHAINMEI")String SHAINMEI);
}