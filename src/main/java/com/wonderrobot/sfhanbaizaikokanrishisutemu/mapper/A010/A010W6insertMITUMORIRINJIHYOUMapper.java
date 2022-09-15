package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A010;


import org.apache.ibatis.annotations.Param;

/**
 * @project
 *     null
 * @comment
 *      id: A010W6insertMITUMORIRINJIHYOUMapper
 * @version

 */

public interface A010W6insertMITUMORIRINJIHYOUMapper {
	public int A010W6insertMITUMORIRINJIHYOU(@Param("HIDZUKE")String HIDZUKE, @Param("KYAKUSAKI")String KYAKUSAKI, @Param("KYAKUSAKITANTOU")String KYAKUSAKITANTOU, @Param("MITSUMORINO")String MITSUMORINO, @Param("SAKUSEISHA")String SAKUSEISHA, @Param("HINMEI")String HINMEI, @Param("BANGOU")double BANGOU, @Param("KOUMOKU")String KOUMOKU, @Param("SUURYOU")int SUURYOU, @Param("PRICE")double PRICE, @Param("GOLD")double GOLD, @Param("KAHEI")String KAHEI, @Param("KIROKUSHAID")String KIROKUSHAID);
}