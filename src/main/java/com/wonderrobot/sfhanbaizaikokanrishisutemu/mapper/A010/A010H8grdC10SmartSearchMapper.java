package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010H8grdC10SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A010H8grdC10SmartSearchMapper
 * @version

 */

public interface A010H8grdC10SmartSearchMapper {
	public List<A010H8grdC10SmartSearchEntity> A010H8grdC10SmartSearch(@Param("_")String _, @Param("CHUUMONBI")String CHUUMONBI, @Param("CHUUMONNO")String CHUUMONNO, @Param("KOUJIBANGOU")String KOUJIBANGOU, @Param("KYAKUSAKIID")String KYAKUSAKIID, @Param("MITSUMORINO")String MITSUMORINO, @Param("TANTOUSHAID")String TANTOUSHAID, @Param("SHUKKOJOUTAI")String SHUKKOJOUTAI);
}