package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A014;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014O4grdC6SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A014O4grdC6SmartSearchMapper
 * @version

 */

public interface A014O4grdC6SmartSearchMapper {
	public List<A014O4grdC6SmartSearchEntity> A014O4grdC6SmartSearch(@Param("BUMONID")String BUMONID, @Param("BUMONMEI")String BUMONMEI);
}