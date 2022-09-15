package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006S4grdB6SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A006S4grdB6SmartSearchMapper
 * @version

 */

public interface A006S4grdB6SmartSearchMapper {
	public List<A006S4grdB6SmartSearchEntity> A006S4grdB6SmartSearch(@Param("KAISHAMEI")String KAISHAMEI, @Param("SHOUHINMEI")String SHOUHINMEI);
}