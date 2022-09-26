package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011O4I00017PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A011O4I00017PrintMapper
 * @version

 */

public interface A011O4I00017PrintMapper {
	public List<A011O4I00017PrintEntity> A011O4I00017Print(@Param("CHUUBUNSHONO1")String CHUUBUNSHONO1);
}