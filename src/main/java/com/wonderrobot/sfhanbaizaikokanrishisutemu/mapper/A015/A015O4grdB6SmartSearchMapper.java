package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A015;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015O4grdB6SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A015O4grdB6SmartSearchMapper
 * @version

 */

public interface A015O4grdB6SmartSearchMapper {
	public List<A015O4grdB6SmartSearchEntity> A015O4grdB6SmartSearch(@Param("KAISHAID")String KAISHAID, @Param("KAISHAMEI")String KAISHAMEI);
}