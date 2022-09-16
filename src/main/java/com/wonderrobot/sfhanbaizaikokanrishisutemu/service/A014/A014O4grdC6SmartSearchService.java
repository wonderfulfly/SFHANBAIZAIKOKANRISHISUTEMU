package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A014;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014O4grdC6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014.A014O4grdC6SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A014.A014GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014O4grdC6SmartSearchService
 *      Page: 部門検索
 * @version

 */

@Service
public class A014O4grdC6SmartSearchService {
	@Autowired
	private A014O4grdC6SmartSearchDao A014O4grdC6SmartSearchDao;

   
	@Log
	public void A014O4grdC6SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//BUMONID
		String BUMONID = null;
		//BUMONMEI
		String BUMONMEI = null;
		List<A014O4grdC6SmartSearchEntity> A014O4grdC6SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A014O4grdC6SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		BUMONID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUMONID")));
		BUMONMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUMONMEI")));
		A014O4grdC6SmartSearchEntityList = A014O4grdC6SmartSearchDao.A014O4grdC6SmartSearch(BUMONID, BUMONMEI);
		
		A014O4grdC6SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A014O4grdC6SmartSearchEntityList != null && A014O4grdC6SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A014O4grdC6SmartSearchEntityList.size();i++) {
				A014O4grdC6SmartSearchEntity A014O4grdC6SmartSearchEntity_i = A014O4grdC6SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("BUMON_BUMONID", StringUtil.changeNullToBlank(A014O4grdC6SmartSearchEntity_i.getA1BUMONID()));
				selMap.put("BUMON_BUMONMEI", StringUtil.changeNullToBlank(A014O4grdC6SmartSearchEntity_i.getA1BUMONMEI()));
				A014O4grdC6SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A014GridDataConstant.getGridStrSet(A014O4grdC6SmartSearchEntityAy, "A014", "13", 50, 1);
		jsonObj.setScript("r", "setGrid13();$('div#_ingrid_Grid13_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB13", returnVal);
		jsonObj.setReturnID("h", "dragB13");
		
		A014GridDataConstant.setGridDataToSession("A014", "13", A014O4grdC6SmartSearchEntityAy, request);

	}
}