package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006S4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006S4grdB6SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A006.A006GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006S4grdB6SmartSearchService
 *      Page: 商品
 * @version

 */

@Service
public class A006S4grdB6SmartSearchService {
	@Autowired
	private A006S4grdB6SmartSearchDao A006S4grdB6SmartSearchDao;

   
	@Log
	public void A006S4grdB6SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//KAISHAMEI
		String KAISHAMEI = null;
		//SHOUHINMEI
		String SHOUHINMEI = null;
		List<A006S4grdB6SmartSearchEntity> A006S4grdB6SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A006S4grdB6SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		KAISHAMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAMEI")));
		SHOUHINMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHOUHINMEI")));
		A006S4grdB6SmartSearchEntityList = A006S4grdB6SmartSearchDao.A006S4grdB6SmartSearch(KAISHAMEI, SHOUHINMEI);
		
		A006S4grdB6SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A006S4grdB6SmartSearchEntityList != null && A006S4grdB6SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A006S4grdB6SmartSearchEntityList.size();i++) {
				A006S4grdB6SmartSearchEntity A006S4grdB6SmartSearchEntity_i = A006S4grdB6SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("SYOUHIN_SHOUHINMEISHOU", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1SHOUHINMEISHOU()));
				selMap.put("SYOUHIN_ZAISHITSU", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1ZAISHITSU()));
				selMap.put("SYOUHIN_TSUKAMATSUNYUUSAKI", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1TSUKAMATSUNYUUSAKI()));
				selMap.put("SYOUHIN_NYUUKAHIDZUKE", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1NYUUKAHIDZUKE()));
				selMap.put("SYOUHIN_PRICE", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1PRICE()));
				selMap.put("SYOUHIN_ZAIKOSUURYOU", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1ZAIKOSUURYOU()));
				selMap.put("SYOUHIN_SHOUHINNO", StringUtil.changeNullToBlank(A006S4grdB6SmartSearchEntity_i.getA1SHOUHINNO()));
				A006S4grdB6SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A006GridDataConstant.getGridStrSet(A006S4grdB6SmartSearchEntityAy, "P00006", "19", 20, 1);
		jsonObj.setScript("r", "setGrid19();$('div#_ingrid_Grid19_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB19", returnVal);
		jsonObj.setReturnID("h", "dragB19");
		
		A006GridDataConstant.setGridDataToSession("P00006", "19", A006S4grdB6SmartSearchEntityAy, request);

	}
}