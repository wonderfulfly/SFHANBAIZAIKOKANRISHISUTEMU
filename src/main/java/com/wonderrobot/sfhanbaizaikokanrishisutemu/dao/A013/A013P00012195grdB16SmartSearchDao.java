package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013P00012195grdB16SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.A013.A013P00012195grdB16SmartSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @project
 *     null
 * @comment
 *      class: A013P00012195grdB16SmartSearchDao
 * @version

 */

@Repository
public class A013P00012195grdB16SmartSearchDao {
	@Autowired
	private A013P00012195grdB16SmartSearchMapper A013P00012195grdB16SmartSearchMapper;

   
	public List<A013P00012195grdB16SmartSearchEntity> A013P00012195grdB16SmartSearch (String BUHINCHUUBUNSHONO, String BUHINCHUUBUNSHOMEISAINO, String KOUJIKANRIBANGOU1) throws Exception {

		List<A013P00012195grdB16SmartSearchEntity> returnVal = A013P00012195grdB16SmartSearchMapper.A013P00012195grdB16SmartSearch(BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1);
		return returnVal;
	}
}