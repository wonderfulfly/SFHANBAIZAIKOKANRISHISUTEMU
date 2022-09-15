package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010H8grdC10SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010H8grdC10SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A010.A010GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010H8grdC10SmartSearchService
 *      Page: 注文管理検索
 * @version

 */

@Service
public class A010H8grdC10SmartSearchService {
	@Autowired
	private A010H8grdC10SmartSearchDao A010H8grdC10SmartSearchDao;

   
	@Log
	public void A010H8grdC10SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//_
		String _ = null;
		//CHUUMONBI
		String CHUUMONBI = null;
		//CHUUMONNO
		String CHUUMONNO = null;
		//KOUJIBANGOU
		String KOUJIBANGOU = null;
		//KYAKUSAKIID
		String KYAKUSAKIID = null;
		//MITSUMORINO
		String MITSUMORINO = null;
		//TANTOUSHAID
		String TANTOUSHAID = null;
		//SHUKKOJOUTAI
		String SHUKKOJOUTAI = null;
		List<A010H8grdC10SmartSearchEntity> A010H8grdC10SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A010H8grdC10SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		_ = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("_")));
		CHUUMONBI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUMONBI")));
		CHUUMONNO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUMONNO")));
		KOUJIBANGOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIBANGOU")));
		KYAKUSAKIID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KYAKUSAKIID")));
		MITSUMORINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("MITSUMORINO")));
		TANTOUSHAID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TANTOUSHAID")));
		SHUKKOJOUTAI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUKKOJOUTAI")));
		A010H8grdC10SmartSearchEntityList = A010H8grdC10SmartSearchDao.A010H8grdC10SmartSearch(_, CHUUMONBI, CHUUMONNO, KOUJIBANGOU, KYAKUSAKIID, MITSUMORINO, TANTOUSHAID, SHUKKOJOUTAI);
		
		A010H8grdC10SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A010H8grdC10SmartSearchEntityList != null && A010H8grdC10SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A010H8grdC10SmartSearchEntityList.size();i++) {
				A010H8grdC10SmartSearchEntity A010H8grdC10SmartSearchEntity_i = A010H8grdC10SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("TYUMONSYO_CHUUBUNSHONO", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1CHUUBUNSHONO()));
				selMap.put("TYUMONSYO_MITSUMORISHONO", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1MITSUMORISHONO()));
				selMap.put("TYUMONSYO_CHUUMONHIDZUKE", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1CHUUMONHIDZUKE()));
				selMap.put("TYUMONSYO_SHOUHINSOUGAKUJPY", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1SHOUHINSOUGAKUJPY()));
				selMap.put("TYUMONSYO_SHANAIKOUJIBANGOU", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1SHANAIKOUJIBANGOU()));
				selMap.put("TYUMONSYO_KYAKUSAKIID", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1KYAKUSAKIID()));
				selMap.put("TYUMONSYO_SHUTSUNYUUKOFURAGU", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1SHUTSUNYUUKOFURAGU()));
				selMap.put("TYUMONSYO_TANTOUSHAID", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1TANTOUSHAID()));
				selMap.put("TYUMONSYO_KYAKUSAKITANTOU", StringUtil.changeNullToBlank(A010H8grdC10SmartSearchEntity_i.getA1KYAKUSAKITANTOU()));
				A010H8grdC10SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A010GridDataConstant.getGridStrSet(A010H8grdC10SmartSearchEntityAy, "P00010", "43", 50, 1);
		jsonObj.setScript("r", "setGrid43();$('div#_ingrid_Grid43_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB43", returnVal);
		jsonObj.setReturnID("h", "dragB43");
		
		A010GridDataConstant.setGridDataToSession("P00010", "43", A010H8grdC10SmartSearchEntityAy, request);

	}
}