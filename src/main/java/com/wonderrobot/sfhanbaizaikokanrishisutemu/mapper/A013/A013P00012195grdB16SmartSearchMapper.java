package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013P00012195grdB16SmartSearchEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A013P00012195grdB16SmartSearchMapper
 * @version

 */

public interface A013P00012195grdB16SmartSearchMapper {
	public List<A013P00012195grdB16SmartSearchEntity> A013P00012195grdB16SmartSearch(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1);
}