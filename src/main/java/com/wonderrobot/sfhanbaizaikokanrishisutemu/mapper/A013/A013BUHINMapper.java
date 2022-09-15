package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013BUHINMapper
 * @version

 */

public interface A013BUHINMapper {
	public List<A013BUHINEntity> A013InitDepthZero(@Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1, @Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO);
}