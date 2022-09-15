package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A013T7insertBUHINSYOUSAIRINJIHYOUMapper
 * @version

 */

public interface A013T7insertBUHINSYOUSAIRINJIHYOUMapper {
	public int A013T7insertBUHINSYOUSAIRINJIHYOU(@Param("KYAKUSAKIMEISHOU")String KYAKUSAKIMEISHOU, @Param("ASENBURIRAIN")String ASENBURIRAIN, @Param("KIKAIMEISHOU")String KIKAIMEISHOU, @Param("BUHINMEISHOU")String BUHINMEISHOU, @Param("HINBANNO1")String HINBANNO1, @Param("SEISAKUSUU")int SEISAKUSUU, @Param("SHANAIKOUJIBANGOU")String SHANAIKOUJIBANGOU, @Param("TANTOUSHA")String TANTOUSHA, @Param("MAISUU")String MAISUU, @Param("HIDZUKE")String HIDZUKE, @Param("HINMEI")String HINMEI, @Param("KOSUU")int KOSUU, @Param("SOUKOSUU")int SOUKOSUU, @Param("ZAISHITSU_KEISHIKI")String ZAISHITSU_KEISHIKI, @Param("SEISAKUSHA")String SEISAKUSHA, @Param("TOUROKUSHAID")String TOUROKUSHAID, @Param("SEISAKUHINKUBUN")String SEISAKUHINKUBUN, @Param("DOUNYUUBANGOU")String DOUNYUUBANGOU, @Param("KIBOUNOUKI")String KIBOUNOUKI, @Param("HINBANNO")String HINBANNO);
}