package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16BUHINSYOUSAIEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A013grdB16BUHINSYOUSAIMapper
 * @version

 */

public interface A013grdB16BUHINSYOUSAIMapper {
	public List<A013grdB16BUHINSYOUSAIEntity> A013InitGrid(@Param("BUHINCHUUBUNSHOMEISAINO")String BUHINCHUUBUNSHOMEISAINO, @Param("BUHINCHUUBUNSHONO")String BUHINCHUUBUNSHONO, @Param("KOUJIKANRIBANGOU1")String KOUJIKANRIBANGOU1);
}