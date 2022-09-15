package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A004;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A004O14insertKAISYAMapper
 * @version

 */

public interface A004O14insertKAISYAMapper {
	public int A004O14insertKAISYA(@Param("KAISHAMEI")String KAISHAMEI, @Param("KAISHARYAKUSHOU")String KAISHARYAKUSHOU, @Param("ADORESU")String ADORESU, @Param("RENRAKUSAKI")String RENRAKUSAKI, @Param("SHIHARAIKIGEN")int SHIHARAIKIGEN, @Param("KAISHAKUBUN")String KAISHAKUBUN, @Param("KAISHAID")String KAISHAID);
}