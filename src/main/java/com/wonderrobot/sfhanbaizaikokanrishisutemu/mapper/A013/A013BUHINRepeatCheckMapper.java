package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINRepeatCheckEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013BUHINRepeatCheckMapper
 * @version

 */

public interface A013BUHINRepeatCheckMapper {
	public List<A013BUHINRepeatCheckEntity> A013BUHINRepeatCheckselectBUHIN(@Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO);
}