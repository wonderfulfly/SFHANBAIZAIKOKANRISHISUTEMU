package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A002;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002O4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002O4grdB6SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A002.A002GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002O4grdB6SmartSearchService
 *      Page: 社員検索
 * @version

 */

@Service
public class A002O4grdB6SmartSearchService {
	@Autowired
	private A002O4grdB6SmartSearchDao A002O4grdB6SmartSearchDao;

   
	@Log
	public void A002O4grdB6SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//SHAINID
		String SHAINID = null;
		//SHAINMEI
		String SHAINMEI = null;
		List<A002O4grdB6SmartSearchEntity> A002O4grdB6SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A002O4grdB6SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		SHAINID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHAINID")));
		SHAINMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHAINMEI")));
		A002O4grdB6SmartSearchEntityList = A002O4grdB6SmartSearchDao.A002O4grdB6SmartSearch(SHAINID, SHAINMEI);
		
		A002O4grdB6SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A002O4grdB6SmartSearchEntityList != null && A002O4grdB6SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A002O4grdB6SmartSearchEntityList.size();i++) {
				A002O4grdB6SmartSearchEntity A002O4grdB6SmartSearchEntity_i = A002O4grdB6SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("SYAIN_SHAINID", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1SHAINID()));
				selMap.put("SYAIN_SHAINMEI", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1SHAINMEI()));
				selMap.put("SYAIN_DENWABANGOU", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1DENWABANGOU()));
				selMap.put("SYAIN_KEITAIBANGOU", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1KEITAIBANGOU()));
				selMap.put("SYAIN_EMAIL", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1EMAIL()));
				selMap.put("SYAIN_LINE", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1LINE()));
				selMap.put("SYAIN_YUUZAAKENGEN", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1YUUZAAKENGEN()));
				selMap.put("SYAIN_ROGUINID", StringUtil.changeNullToBlank(A002O4grdB6SmartSearchEntity_i.getA1ROGUINID()));
				A002O4grdB6SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A002GridDataConstant.getGridStrSet(A002O4grdB6SmartSearchEntityAy, "P00002", "13", 50, 1);
		jsonObj.setScript("r", "setGrid13();$('div#_ingrid_Grid13_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB13", returnVal);
		jsonObj.setReturnID("h", "dragB13");
		
		A002GridDataConstant.setGridDataToSession("P00002", "13", A002O4grdB6SmartSearchEntityAy, request);

	}
}