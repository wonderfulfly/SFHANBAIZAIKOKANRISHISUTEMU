package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006L4I00016PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A006L4I00016PrintMapper
 * @version

 */

public interface A006L4I00016PrintMapper {
	public List<A006L4I00016PrintEntity> A006L4I00016Print(@Param("KAISHAMEI")String KAISHAMEI, @Param("SHOUHINMEI")String SHOUHINMEI);
}