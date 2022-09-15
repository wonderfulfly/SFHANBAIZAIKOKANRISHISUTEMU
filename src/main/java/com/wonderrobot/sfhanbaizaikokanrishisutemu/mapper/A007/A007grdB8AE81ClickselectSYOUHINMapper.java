package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A007;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8AE81ClickselectSYOUHINEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      id: A007grdB8AE81ClickselectSYOUHINMapper
 * @version

 */

public interface A007grdB8AE81ClickselectSYOUHINMapper {
	public List<A007grdB8AE81ClickselectSYOUHINEntity> A007grdB8AE81ClickselectSYOUHIN(@Param("SHOUHINNO")String SHOUHINNO);
}