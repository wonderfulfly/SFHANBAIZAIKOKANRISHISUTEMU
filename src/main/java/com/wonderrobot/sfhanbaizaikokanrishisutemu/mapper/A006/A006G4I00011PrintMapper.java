package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A006;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006G4I00011PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A006G4I00011PrintMapper
 * @version

 */

public interface A006G4I00011PrintMapper {
	public List<A006G4I00011PrintEntity> A006G4I00011Print(@Param("SHOUHINMEI")String SHOUHINMEI, @Param("KAISHAMEI")String KAISHAMEI);
}