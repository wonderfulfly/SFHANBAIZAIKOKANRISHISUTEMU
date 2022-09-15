package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W2I00015PrintEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A010W2I00015PrintMapper
 * @version

 */

public interface A010W2I00015PrintMapper {
	public List<A010W2I00015PrintEntity> A010W2I00015Print(@Param("CHUUMONNO")String CHUUMONNO, @Param("TANTOUSHAID")String TANTOUSHAID, @Param("KYAKUSAKIID")String KYAKUSAKIID, @Param("SHUKKOJOUTAI")String SHUKKOJOUTAI);
}