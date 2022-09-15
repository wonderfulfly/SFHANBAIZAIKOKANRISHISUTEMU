package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A005;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A005C14insertKAISYAMapper
 * @version

 */

public interface A005C14insertKAISYAMapper {
	public int A005C14insertKAISYA(@Param("KAISHAID")String KAISHAID, @Param("KAISHAMEI")String KAISHAMEI, @Param("KAISHARYAKUSHOU")String KAISHARYAKUSHOU, @Param("ADORESU")String ADORESU, @Param("RENRAKUSAKI")String RENRAKUSAKI, @Param("SHIHARAIKIGEN")int SHIHARAIKIGEN, @Param("KAISHAKUBUN")String KAISHAKUBUN);
}