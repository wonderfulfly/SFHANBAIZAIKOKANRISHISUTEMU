package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008I6grdB8SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008I6grdB8SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A008.A008GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008I6grdB8SmartSearchService
 *      Page: 入金管理検索
 * @version

 */

@Service
public class A008I6grdB8SmartSearchService {
	@Autowired
	private A008I6grdB8SmartSearchDao A008I6grdB8SmartSearchDao;

   
	@Log
	public void A008I6grdB8SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//KYAKUSAKI
		String KYAKUSAKI = null;
		//CHUUMONHIDZUKE
		String CHUUMONHIDZUKE = null;
		List<A008I6grdB8SmartSearchEntity> A008I6grdB8SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A008I6grdB8SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		KYAKUSAKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KYAKUSAKI")));
		CHUUMONHIDZUKE = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUMONHIDZUKE")));
		A008I6grdB8SmartSearchEntityList = A008I6grdB8SmartSearchDao.A008I6grdB8SmartSearch(KYAKUSAKI, CHUUMONHIDZUKE);
		
		A008I6grdB8SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A008I6grdB8SmartSearchEntityList != null && A008I6grdB8SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A008I6grdB8SmartSearchEntityList.size();i++) {
				A008I6grdB8SmartSearchEntity A008I6grdB8SmartSearchEntity_i = A008I6grdB8SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("I00003_KYAKUSAKIID", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1KYAKUSAKIID()));
				selMap.put("I00003_SHANAIKOUJIBANGOU", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1SHANAIKOUJIBANGOU()));
				selMap.put("I00003_SHOUHINSOUGAKUJPY", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1SHOUHINSOUGAKUJPY()));
				selMap.put("I00003_TANTOUSHAID", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1TANTOUSHAID()));
				selMap.put("I00003_CHUUMONHIDZUKE", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1CHUUMONHIDZUKE()));
				selMap.put("I00003_SHIHARAIHIDZUKE", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1SHIHARAIHIDZUKE()));
				selMap.put("I00003_FURIDASHIZUMIWARIAI", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1FURIDASHIZUMIWARIAI()));
				selMap.put("I00003_FURIDASHIZUMIHIDZUKE", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1FURIDASHIZUMIHIDZUKE()));
				selMap.put("I00003_FURIDASHIZUMIKINGAKU", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1FURIDASHIZUMIKINGAKU()));
				selMap.put("I00003_NYUUKINWARIAI", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1NYUUKINWARIAI()));
				selMap.put("I00003_NYUUKINGAKU", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1NYUUKINGAKU()));
				selMap.put("I00003_NYUUKINZUMIWARIAI", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1NYUUKINZUMIWARIAI()));
				selMap.put("I00003_NYUUKINZUMIKINGAKU", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1NYUUKINZUMIKINGAKU()));
				selMap.put("I00003_MINYUUKINWARIAI", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1MINYUUKINWARIAI()));
				selMap.put("I00003_MINYUUKINKINGAKU", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1MINYUUKINKINGAKU()));
				selMap.put("I00003_RESHIITONO", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1RESHIITONO()));
				selMap.put("I00003_CHUUBUNSHONO", StringUtil.changeNullToBlank(A008I6grdB8SmartSearchEntity_i.getA1CHUUBUNSHONO()));
				A008I6grdB8SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A008GridDataConstant.getGridStrSet(A008I6grdB8SmartSearchEntityAy, "A008", "23", 20, 1);
		jsonObj.setScript("r", "setGrid23();$('div#_ingrid_Grid23_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB23", returnVal);
		jsonObj.setReturnID("h", "dragB23");
		
		A008GridDataConstant.setGridDataToSession("A008", "23", A008I6grdB8SmartSearchEntityAy, request);

	}
}