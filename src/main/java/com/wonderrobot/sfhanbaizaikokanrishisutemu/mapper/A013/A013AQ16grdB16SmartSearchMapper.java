package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AQ16grdB16SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A013AQ16grdB16SmartSearchMapper
 * @version

 */

public interface A013AQ16grdB16SmartSearchMapper {
	public List<A013AQ16grdB16SmartSearchEntity> A013AQ16grdB16SmartSearch(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("KOUNYUUHIDZUKE1")String KOUNYUUHIDZUKE1);
}