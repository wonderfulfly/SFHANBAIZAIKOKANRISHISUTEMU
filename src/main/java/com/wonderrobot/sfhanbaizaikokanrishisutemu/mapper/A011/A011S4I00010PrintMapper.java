package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011S4I00010PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A011S4I00010PrintMapper
 * @version

 */

public interface A011S4I00010PrintMapper {
	public List<A011S4I00010PrintEntity> A011S4I00010Print(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}