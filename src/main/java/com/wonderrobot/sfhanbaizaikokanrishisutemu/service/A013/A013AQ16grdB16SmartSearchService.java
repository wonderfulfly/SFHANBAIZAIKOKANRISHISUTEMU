package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AQ16grdB16SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013AQ16grdB16SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A013.A013GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AQ16grdB16SmartSearchService
 *      Page: 部品管理画面
 * @version

 */

@Service
public class A013AQ16grdB16SmartSearchService {
	@Autowired
	private A013AQ16grdB16SmartSearchDao A013AQ16grdB16SmartSearchDao;

   
	@Log
	public void A013AQ16grdB16SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//BUHINCHUUBUNSHONO
		String BUHINCHUUBUNSHONO = null;
		//BUHINCHUUBUNSHOMEISAINO
		String BUHINCHUUBUNSHOMEISAINO = null;
		//KOUJIKANRIBANGOU1
		String KOUJIKANRIBANGOU1 = null;
		//KOUNYUUHIDZUKE1
		String KOUNYUUHIDZUKE1 = null;
		List<A013AQ16grdB16SmartSearchEntity> A013AQ16grdB16SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A013AQ16grdB16SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
		BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		KOUNYUUHIDZUKE1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUNYUUHIDZUKE1")));
		A013AQ16grdB16SmartSearchEntityList = A013AQ16grdB16SmartSearchDao.A013AQ16grdB16SmartSearch(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1, KOUNYUUHIDZUKE1);
		
		A013AQ16grdB16SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A013AQ16grdB16SmartSearchEntityList != null && A013AQ16grdB16SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A013AQ16grdB16SmartSearchEntityList.size();i++) {
				A013AQ16grdB16SmartSearchEntity A013AQ16grdB16SmartSearchEntity_i = A013AQ16grdB16SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("BUHINSYOUSAI_SEISAKUHINKUBUN", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1SEISAKUHINKUBUN()));
				selMap.put("BUHINSYOUSAI_HINBANNO1", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1HINBANNO1()));
				selMap.put("BUHINSYOUSAI_HINMEI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1HINMEI()));
				selMap.put("BUHINSYOUSAI_KOSUU", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KOSUU()));
				selMap.put("BUHINSYOUSAI_SOUKOSUU", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1SOUKOSUU()));
				selMap.put("BUHINSYOUSAI_TSUKAMATSUNYUUSAKI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1TSUKAMATSUNYUUSAKI()));
				selMap.put("BUHINSYOUSAI_KIBOUNOUKI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KIBOUNOUKI()));
				selMap.put("BUHINSYOUSAI_TANTOU", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1TANTOU()));
				selMap.put("BUHINSYOUSAI_TEHAISAKI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1TEHAISAKI()));
				selMap.put("BUHINSYOUSAI_KOUNYUUTANKA", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KOUNYUUTANKA()));
				selMap.put("BUHINSYOUSAI_KAHEI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KAHEI()));
				selMap.put("BUHINSYOUSAI_TEHAIBI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1TEHAIBI()));
				selMap.put("BUHINSYOUSAI_NYUUKABI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1NYUUKABI()));
				selMap.put("BUHINSYOUSAI_SHOUKEI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1SHOUKEI()));
				selMap.put("BUHINSYOUSAI_KAKOTANKA", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KAKOTANKA()));
				selMap.put("BUHINSYOUSAI_CHUUBUNSHOMEISAINO", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1CHUUBUNSHOMEISAINO()));
				selMap.put("BUHINSYOUSAI_CHUUBUNSHONO", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1CHUUBUNSHONO()));
				selMap.put("BUHINSYOUSAI_KIBOUTANKA", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KIBOUTANKA()));
				selMap.put("BUHINSYOUSAI_NYUUKAYOTEIBI", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1NYUUKAYOTEIBI()));
				selMap.put("BUHINSYOUSAI_HINBANNO", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1HINBANNO()));
				selMap.put("BUHINSYOUSAI_KOUJIKANRIBANGOU", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KOUJIKANRIBANGOU()));
				selMap.put("BUHINSYOUSAI_KAKUTEIKUBUN", StringUtil.changeNullToBlank(A013AQ16grdB16SmartSearchEntity_i.getA1KAKUTEIKUBUN()));
				A013AQ16grdB16SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A013GridDataConstant.getGridStrSet(A013AQ16grdB16SmartSearchEntityAy, "P00012", "99", 50, 1);
		jsonObj.setScript("r", "setGrid99();$('div#_ingrid_Grid99_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB99", returnVal);
		jsonObj.setReturnID("h", "dragB99");
		
		A013GridDataConstant.setGridDataToSession("P00012", "99", A013AQ16grdB16SmartSearchEntityAy, request);

	}
}